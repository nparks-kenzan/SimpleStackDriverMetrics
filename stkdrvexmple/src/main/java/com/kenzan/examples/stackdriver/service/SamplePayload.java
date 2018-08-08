/**
 * 
 */
package com.kenzan.examples.stackdriver.service;

import java.util.Random;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author parksn
 *
 */
public class SamplePayload {
	
	private String szText;
	private String szMoreText;
	private UUID id;
	private double dRand;
	private static Random rRand= new Random();

	public SamplePayload() {
		id = UUID.randomUUID();
		szText = "some string";
		dRand = rRand.nextGaussian();
		szMoreText = "More text";
		
	}
	/**
	 * @return the szText
	 */
	public String getSzText() {
		return szText;
	}

	/**
	 * @return the szMoreText
	 */
	public String getSzMoreText() {
		return szMoreText;
	}

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * @return the dRand
	 */
	public double getdRand() {
		return dRand;
	}

    @JsonCreator
    public SamplePayload(@JsonProperty("id") UUID id,
    @JsonProperty("maintext") String szText,
    @JsonProperty("minortext") String szMoreText,
    @JsonProperty("factor") double dRand) {

     this.szText=szText;
	this.szMoreText=szMoreText;
	this.id=id;
    this.dRand=dRand;
    }


}
