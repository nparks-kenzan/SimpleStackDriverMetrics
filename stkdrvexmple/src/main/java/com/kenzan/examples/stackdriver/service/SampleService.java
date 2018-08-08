/**
 * 
 */
package com.kenzan.examples.stackdriver.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author parksn
 *
 */
@Path("/somestrings")
public class SampleService {
	private static final Logger logger = LoggerFactory.getLogger(SampleService.class);	

	//private SamplePayload spSimplePayload;
	/**
	 * 
	 */
	public SampleService() {
		logger.debug("-- Sample Service Created --");

		//this.spSimplePayload = new SamplePayload();
	}
	
	@GET
    @Produces({ MediaType.APPLICATION_JSON})
	public SamplePayload getPayload(){
		return new SamplePayload();
	}
	
	

}
