package com.bicycle.bicycleserviceimplement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bicycle.apiresponse.ApiResponse;
import com.bicycle.bicycledetails.BicycleDetails;
import com.bicycle.bicycledetailsmodel.BicycleDetailsModel;
import com.bicycle.bicyclerepository.BicycleRepository;
import com.bicycle.bicycleservice.BicycleService;
import com.bicycle.globalconstant.GlobalConstant;

@Service
public class BicycleServiceImplement implements BicycleService {

	@Autowired
	BicycleRepository bicycleRepository;

//	Dummy API for Testing

	@Override
	public ApiResponse dummyApi() {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(GlobalConstant.dummyApi);
		return apiResponse;
	}

//	Data Insertion block

	@Override
	public ApiResponse saveData(BicycleDetailsModel bicycleDetailsModel) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		BicycleDetails bicycleDetails = new BicycleDetails();

		try {
			bicycleDetails.setBicycleName(bicycleDetailsModel.getBicycleName());
			bicycleDetails.setBicycleModel(bicycleDetailsModel.getBicycleModel());
			bicycleDetails.setBicycleManual(bicycleDetailsModel.getBicycleManual());
			bicycleDetails.setBicycleAuto(bicycleDetailsModel.getBicycleAuto());
			bicycleDetails.setBicyclePrice(bicycleDetailsModel.getBicyclePrice());

			bicycleRepository.save(bicycleDetails);
			apiResponse.setMessage(GlobalConstant.dataInsertionSuccess);

		} catch (Exception e) {

			apiResponse.setMessage(GlobalConstant.dataInsertionfail);
		}

		return apiResponse;
	}

//	Get All Data Block

	@Override
	public ApiResponse getAllData() {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setAllBicycleDetails(bicycleRepository.findAll());
		return apiResponse;
	}

//	Get Data By Id block

	@Override
	public ApiResponse getDataById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		Optional<BicycleDetails> dbData = bicycleRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataGetByIdFail);
		} else {
			apiResponse.setBicycleDetail(dbData.get());
			apiResponse.setMessage(GlobalConstant.dataGetByIdSuccess);

		}

		return apiResponse;
	}

//	Get Data Updated by ID

	@Override
	public ApiResponse dataUpdation(BicycleDetailsModel bicycleDetailsModel, Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		Optional<BicycleDetails> dbData = bicycleRepository.findById(id);

		if (dbData.isEmpty()) {
			apiResponse.setStatus(false);
			apiResponse.setMessage(GlobalConstant.dataUpdationFail + id);
		} else {
			BicycleDetails bicycleDetails = dbData.get();

			bicycleDetails.setBicycleName(bicycleDetailsModel.getBicycleName());
			bicycleDetails.setBicycleModel(bicycleDetailsModel.getBicycleModel());
			bicycleDetails.setBicycleManual(bicycleDetailsModel.getBicycleManual());
			bicycleDetails.setBicycleAuto(bicycleDetailsModel.getBicycleAuto());
			bicycleDetails.setBicyclePrice(bicycleDetailsModel.getBicyclePrice());

			bicycleRepository.save(bicycleDetails);

			apiResponse.setMessage(GlobalConstant.dataUpdationSuccess);
			apiResponse.setStatus(true);

		}

		return apiResponse;
	}

//	Data deletion By id Block

	@Override
	public ApiResponse dataDeletionById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		Optional<BicycleDetails> dbData = bicycleRepository.findById(id);

		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataDeletionFail);

		} else {
			bicycleRepository.deleteById(id);
			apiResponse.setMessage(GlobalConstant.dataDeletionSuccess);
		}

		return apiResponse;
	}

//	Data Get By Name Block

//	@Override
//	public ApiResponse dataGetByName(String name) {
//		// TODO Auto-generated method stub
//		ApiResponse apiResponse = new ApiResponse(); 
//		List<BicycleDetails> dbName = bicycleRepository.findByName(name);
////		Optional<BicycleDetails> dbName = bicycleRepository.findByName();		
//		if (dbName.isEmpty()) {
//			apiResponse.setMessage("");
//			apiResponse.setMessage(GlobalConstant.nameNotFound);
//			
//		}else {
//			apiResponse.setMessage(GlobalConstant.nameFound);
//		}
//		
//		return apiResponse;
//	}

	
	
//	
	
//	

}









