package com.crhc.eventrule.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.crhc.eventrule.config.DroolConfig;
import com.crhc.eventrule.exception.FileStorageException;
import com.crhc.eventrule.property.FileStorageProperties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
/**
 * 
 * @author ADMIN
 *
 */
@Service
public class FileStorageService {

    private final Path fileStorageLocation;
    Logger logger = LoggerFactory.getLogger(FileStorageService.class);
/**
 *  method where the directory of uploaded file is created.It is a service class
 * @param fileStorageProperties
 */
    @Autowired
    public FileStorageService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
        	logger.error("error {}",ex);
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }
/**
 * in this method it checks whether the path provided for file is valid or not
 * @param file
 * @return filename
 */
    public String storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (IOException ex) {
        	logger.error("error {}",ex);
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

}

