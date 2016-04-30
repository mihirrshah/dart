package com.clmapp.workerbees.model;

import org.springframework.data.annotation.Id;
public class Customer {
	
	@Id
	private String _id;
	private String name;
	private String policyNbr;
	private String distance;
	private String position;
	private String telephoneNbr;
	private String city;
	private String state;
	private String postalCode;
	private String countryCode;
	private String streetName;
	private String structureNum;


	

	private String url_img;
	private String severity;
	private String exposure;
	
	
	public Customer() {}
	
	public Customer (String name,String policyNbr, String distance, String position,String telephoneNbr, String city, String state, String postalCode, String countryCode, String streetName, String structureNum){
		this._id = _id;
		this.name = name;
		this.policyNbr = policyNbr;
		this.distance = distance;
		this.position = position;
		this.telephoneNbr = telephoneNbr;
		this.city = city;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
		this.streetName = streetName;
		this.structureNum = structureNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicyNbr() {
		return policyNbr;
	}

	public void setPolicyNbr(String policyNbr) {
		this.policyNbr = policyNbr;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getposition() {
		return position;
	}

	public void setposition(String position) {
		this.position = position;
	}

	public String getTelephoneNbr() {
		return telephoneNbr;
	}

	public void setTelephoneNbr(String telephoneNbr) {
		this.telephoneNbr = telephoneNbr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStructureNum() {
		return structureNum;
	}

	public void setStructureNum(String structureNum) {
		this.structureNum = structureNum;
	}
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getUrl_img() {
		return url_img;
	}

	public void setUrl_img(String url_img) {
		this.url_img = url_img;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getExposure() {
		return exposure;
	}

	public void setExposure(String exposure) {
		this.exposure = exposure;
	}

}
