package com.codingdojo.dojosNinjas.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosNinjas.models.Dojo;
import com.codingdojo.dojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	};
	
	// create a Dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	};
	
	// get all of the Dojos
	public List<Dojo> dojoAll(){
		return dojoRepo.findAll();
	};
	
	// get specific Dojo
	public Dojo oneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	};

}
