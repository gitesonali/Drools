package com.crhc.eventrule.controller;

import java.io.File;
import java.io.IOException;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.crhc.eventrule.listener.TrackingAgendaEventListener;
import com.crhc.eventrule.model.Event;
import com.crhc.eventrule.model.UploadFileResponse;
import com.crhc.eventrule.service.FileStorageService;
import com.crhc.model.Patient;

/**
 * 
 * @author Medevantage
 *
 */
@RestController
public class Controller {
	@Autowired
	private KieSession session;
	
	@Autowired
    private FileStorageService fileStorageService;
	
/**
 * inserts all the patient details in kiesession and fire the rules	
 * @param patient
 * @return event
 */
	@PostMapping("/validateEvent")
	public Event orderNow(@RequestBody Patient patient) {
		System.out.println("controller class1"+patient);
		TrackingAgendaEventListener tracker = new TrackingAgendaEventListener();
		session.addEventListener(tracker);
		session.insert(patient);
		session.fireAllRules();
		System.out.println("This is contrller class 2 after kie"+patient);
		System.out.println("This is contrller class 3 after kie"+patient.getSelectedEvent());
		System.out.println("This is contrller class 3 after kie"+patient.getSelectedEventId());
		Event event = new Event(patient.getSelectedEvent(),patient.getFinalselectedEvent(),patient.getSelectedEventId(),tracker.matchsToString());
		session.removeEventListener(tracker);
		for( Object object: session.getObjects() ){
			session.delete( session.getFactHandle( object ) );
	     }
		return event;
	}
	
	/**
	 * upload file which returns the response of the file
	 * @param file
	 * @return fileresponse
	 * @throws IOException
	 */
    @PostMapping("/uploadFile")
    public boolean uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = fileStorageService.storeFile(file);
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "rules.bat");
        File dir = new File("C:/devops");
        pb.directory(dir);
        Process p = pb.start();
        return true;
    }

}
