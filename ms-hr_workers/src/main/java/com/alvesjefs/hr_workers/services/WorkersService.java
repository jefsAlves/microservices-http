package com.alvesjefs.hr_workers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hr_workers.domain.Workers;
import com.alvesjefs.hr_workers.repositories.WorkersRepository;
import com.alvesjefs.hr_workers.services.exceptions.ObjectNotFoundException;

@Service
public class WorkersService {

	@Autowired
	private WorkersRepository workersRepository;

	public Workers findById(Long id) {
		Optional<Workers> workers = workersRepository.findById(id);
		return workers.orElseThrow(() -> new ObjectNotFoundException("Sorry, Object Not Found!"));
	}

	public List<Workers> findAll(Workers workers) {
		return workersRepository.findAll();
	}
}
