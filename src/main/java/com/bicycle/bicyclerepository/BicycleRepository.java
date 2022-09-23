package com.bicycle.bicyclerepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bicycle.bicycledetails.BicycleDetails;

public interface BicycleRepository extends JpaRepository<BicycleDetails, Integer> {

	List<BicycleDetails> findByName(String name);
}
