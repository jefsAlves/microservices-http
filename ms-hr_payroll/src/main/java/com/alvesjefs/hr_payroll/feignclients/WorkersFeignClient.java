package com.alvesjefs.hr_payroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alvesjefs.hr_payroll.domain.Workers;

@Component
@FeignClient(value = "hr-workers", url = "localhost:8001", path = "/api/workers")
public interface WorkersFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Workers> findById(@PathVariable Long id);

}
