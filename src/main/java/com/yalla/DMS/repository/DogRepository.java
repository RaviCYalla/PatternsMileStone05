package com.yalla.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yalla.DMS.Models.Dog;

/**
 * 
 * @author S555425 - Ravi Yalla
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);
	

}


