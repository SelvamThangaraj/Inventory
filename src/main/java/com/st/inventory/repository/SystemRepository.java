package com.st.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.st.inventory.model.SystemDetails;


public interface SystemRepository extends CrudRepository<SystemDetails,Long>{

}
