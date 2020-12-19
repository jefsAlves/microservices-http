package com.alvesjefs.hr_workers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.hr_workers.domain.Workers;
import com.alvesjefs.hr_workers.services.WorkersService;

@RestController
@RequestMapping(value = "/api/workers")
public class WorkersResources {

	@Autowired
	private WorkersService workersService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Workers> finById(@PathVariable Long id) {
		Workers workers = workersService.findById(id);
		return ResponseEntity.ok().body(workers);
	}
}
