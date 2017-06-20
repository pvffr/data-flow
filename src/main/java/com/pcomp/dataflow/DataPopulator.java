package com.pcomp.dataflow;

import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataPopulator {

	@Autowired
	private ParameterRepository parameterRepository;
	
	@PostConstruct
    public void init(){
       populate();
    }
	
	public void populate() {
		for (int i = 0; i < 30000; i++) {
			parameterRepository.save(new Parameter(UUID.randomUUID(), "KEY", "param", String.valueOf(i)));
		}
	}
}
