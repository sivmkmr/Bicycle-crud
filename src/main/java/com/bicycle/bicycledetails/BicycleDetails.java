package com.bicycle.bicycledetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class BicycleDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bycycleId;
	private String bicycleName;
	private String bicycleModel;
	private String bicycleManual;
	private String bicycleAuto;
	private String bicyclePrice;

	// Getters And Setters

	public Integer getBycycleId() {
		return bycycleId;
	}

	public void setBycycleId(Integer bycycleId) {
		this.bycycleId = bycycleId;
	}

	public String getBicycleName() {
		return bicycleName;
	}

	public void setBicycleName(String bicycleName) {
		this.bicycleName = bicycleName;
	}

	public String getBicycleModel() {
		return bicycleModel;
	}

	public void setBicycleModel(String bicycleModel) {
		this.bicycleModel = bicycleModel;
	}

	public String getBicycleManual() {
		return bicycleManual;
	}

	public void setBicycleManual(String bicycleManual) {
		this.bicycleManual = bicycleManual;
	}

	public String getBicycleAuto() {
		return bicycleAuto;
	}

	public void setBicycleAuto(String bicycleAuto) {
		this.bicycleAuto = bicycleAuto;
	}

	public String getBicyclePrice() {
		return bicyclePrice;
	}

	public void setBicyclePrice(String bicyclePrice) {
		this.bicyclePrice = bicyclePrice;
	}

}
