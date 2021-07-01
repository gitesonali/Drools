package com.crhc.eventrule.config;

import java.io.IOException;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author Medevantage
 *
 */
@Configuration
public class DroolConfig {

	private static final String G = "com.crhc.kie-scanner";
	private static final String A = "drools-kiescanner";
	private static final String V = "1.0-SNAPSHOT";
	
	private KieServices kieServices = KieServices.Factory.get();
	Logger logger = LoggerFactory.getLogger(DroolConfig.class);
/**
 * Here the container is created
 * @return container
 */
	@Bean
	public KieContainer getKieContainer() {
		System.out.println("Container created...");
		ReleaseId releaseID = kieServices.newReleaseId(G, A, V);
		
		KieContainer kContainer = kieServices.newKieContainer(releaseID);

		KieScanner kScanner = kieServices.newKieScanner(kContainer);
		kScanner.start(5000);
	    logger.error("error {}");
			
		return kContainer;

	}
/**
 * sessions is created here
 * @return session
 * @throws IOException
 */
	@Bean
	public KieSession getKieSession() throws IOException {
		System.out.println("session created...");
		KieBase kBase = getKieContainer().getKieBase("EventKB");
		
		KieSession kSession = kBase.newKieSession();
	    logger.error("error {}");
		return kSession;

	}

}
