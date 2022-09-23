package com.bicycle.bicycleservice;

import com.bicycle.apiresponse.ApiResponse;
import com.bicycle.bicycledetailsmodel.BicycleDetailsModel;

public interface BicycleService {

	public ApiResponse dummyApi();

	public ApiResponse saveData(BicycleDetailsModel bicycleDetailsModel);

	public ApiResponse getAllData();

	public ApiResponse getDataById(Integer id);

	public ApiResponse dataUpdation(BicycleDetailsModel bicycleDetailsModel, Integer id);

	public ApiResponse dataDeletionById(Integer id);
	
//	public ApiResponse dataGetByName(String name);

	
}
