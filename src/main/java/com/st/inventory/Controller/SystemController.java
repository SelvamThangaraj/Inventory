package com.st.inventory.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.st.inventory.Exception.RecordNotFoundException;
import com.st.inventory.Service.SystemService;
import com.st.inventory.model.SystemDetails;

@RestController
public class SystemController {
	
	@Autowired
	SystemService systemService;
	
	@GetMapping(value="/system/{id}",
			 produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SystemDetails> getSystemDetails(@PathVariable("id") long id) throws RecordNotFoundException {
		
		Optional<SystemDetails> sysDetail = systemService.getById(id);
        if (sysDetail.isPresent()) {
            return new ResponseEntity<>(sysDetail.get(), HttpStatus.OK);
        } else {
            throw new RecordNotFoundException();
        }        
	}
	
	@PostMapping(path = "system", 
	        consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SystemDetails> storeSystemDetails(@RequestBody SystemDetails systemDetail) throws RecordNotFoundException {
		
		SystemDetails user = systemService.save(systemDetail);
	    if (user == null) {
	    	throw new RecordNotFoundException();
	    } else {
	        return new ResponseEntity<>(user, HttpStatus.CREATED);
	    }	   
	}
	
	/*
	 * public static void main(String args[]) { ObjectMapper objectMapper = new
	 * ObjectMapper(); SystemDetails sysDetail=new SystemDetails(new
	 * Long(1),"3434-456","Intel","2","250","Intel"); try {
	 * System.out.println(objectMapper.writeValueAsString(sysDetail)); } catch
	 * (JsonProcessingException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
}	
