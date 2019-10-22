package com.church.members.entity;

import java.util.Date;

public class Member {
	
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;

	private Date dateOfBirth;
	private String maritalStatus;
	private String gender;
	
	private String address;
	private String postalCode;
	private String location;
	
	private String mobileNumber;
	private String residenceNumber;
	private String email;
	
	private String relationshipToPrimary;
	private String status;
	private String votingRight;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getResidenceNumber() {
		return residenceNumber;
	}
	public void setResidenceNumber(String residenceNumber) {
		this.residenceNumber = residenceNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRelationshipToPrimary() {
		return relationshipToPrimary;
	}
	public void setRelationshipToPrimary(String relationshipToPrimary) {
		this.relationshipToPrimary = relationshipToPrimary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVotingRight() {
		return votingRight;
	}
	public void setVotingRight(String votingRight) {
		this.votingRight = votingRight;
	}
	

	
	public Member(String id, String firstName, String middleName, String lastName, Date dateOfBirth,
			String maritalStatus, String gender, String address, String postalCode, String location,
			String mobileNumber, String residenceNumber, String email, String relationshipToPrimary, String status,
			String votingRight) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		this.address = address;
		this.postalCode = postalCode;
		this.location = location;
		this.mobileNumber = mobileNumber;
		this.residenceNumber = residenceNumber;
		this.email = email;
		this.relationshipToPrimary = relationshipToPrimary;
		this.status = status;
		this.votingRight = votingRight;
	}

	public Member() {
		//emptyConstructor
	}

}
