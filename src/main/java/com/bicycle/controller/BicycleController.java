package com.bicycle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bicycle.apiresponse.ApiResponse;
import com.bicycle.bicycledetailsmodel.BicycleDetailsModel;
import com.bicycle.bicycleserviceimplement.BicycleServiceImplement;

@RestController
public class BicycleController {

	@Autowired
	BicycleServiceImplement bicycleServiceImplement;

//	Dummy API for Testing

	@GetMapping("/dummy-api")
	public ApiResponse dummyApi() {
		return bicycleServiceImplement.dummyApi();

	}

//	Data Insertion block

	@PostMapping("/insert-data")
	public ApiResponse saveData(@RequestBody BicycleDetailsModel bicycleDetailsModel) {
		return bicycleServiceImplement.saveData(bicycleDetailsModel);

	}

//	Get All Data Block

	@GetMapping("/get-all-bicycle-data")
	public ApiResponse getData() {
		return bicycleServiceImplement.getAllData();

	}

//	Get Data By Id block

	@GetMapping("/get-data-by-id/{id}")
	public ApiResponse getDataById(@PathVariable("id") Integer id) {
		return bicycleServiceImplement.getDataById(id);

	}

//	Get Data Updated by ID Block
	@PutMapping("/data-updation-by-id/{id}")
	public ApiResponse dataUpdation(@RequestBody BicycleDetailsModel bicycleDetailsModel,
			@PathVariable("id") Integer id) {
		return bicycleServiceImplement.dataUpdation(bicycleDetailsModel, id);

	}

//	Data deletion By id Block
	@DeleteMapping("/data-delete-by-id/{id}")
	public ApiResponse dataDeletionById(@PathVariable("id") Integer id) {
		return bicycleServiceImplement.dataDeletionById(id);
	}

//	Data Get By Name Block

//	@GetMapping("/data-get-by-name/name")
//	public ApiResponse dataGetByName(@RequestParam String name) {
//		// TODO Auto-generated method stub
//		return bicycleServiceImplement.dataGetByName(name);
//	}

//	

}
