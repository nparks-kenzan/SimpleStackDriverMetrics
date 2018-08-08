/**
 * 
 */
package com.kenzan.examples.stackdriver.service;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author parksn
 *
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		 packages(getClass().getPackage().getName() );
	}


}
