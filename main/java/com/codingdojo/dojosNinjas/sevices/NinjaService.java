package com.codingdojo.dojosNinjas.sevices;


import org.springframework.stereotype.Service;

import com.codingdojo.dojosNinjas.models.Ninja;
import com.codingdojo.dojosNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	};
	
	//create a Ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	};
	
}
