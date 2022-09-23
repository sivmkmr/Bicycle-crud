package com.bicycle.apiresponse;

import java.util.List;

import com.bicycle.bicycledetails.BicycleDetails;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

	private String message;

	private List<BicycleDetails> allBicycleDetails;

	private BicycleDetails bicycleDetail;
	
	private boolean status;

//	Getters And Setters

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<BicycleDetails> getAllBicycleDetails() {
		return allBicycleDetails;
	}

	public void setAllBicycleDetails(List<BicycleDetails> allBicycleDetails) {
		this.allBicycleDetails = allBicycleDetails;
	}

	public BicycleDetails getBicycleDetail() {
		return bicycleDetail;
	}

	public void setBicycleDetail(BicycleDetails bicycleDetail) {
		this.bicycleDetail = bicycleDetail;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
