package com.st.inventory.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.inventory.model.SystemDetails;
import com.st.inventory.repository.SystemRepository;

@Service
public class SystemService {
	
	@Autowired
	SystemRepository systemRepository;

	public Optional<SystemDetails> getById(long id) {
		return systemRepository.findById(id);
		
	}

	public SystemDetails save(SystemDetails systemDetail) {
		return systemRepository.save(systemDetail);
	}

	
}
