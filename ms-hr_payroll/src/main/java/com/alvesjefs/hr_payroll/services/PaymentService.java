package com.alvesjefs.hr_payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hr_payroll.domain.Payment;
import com.alvesjefs.hr_payroll.domain.Workers;
import com.alvesjefs.hr_payroll.feignclients.WorkersFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkersFeignClient workersFeignClient;

	public Payment getPayment(Long id, Integer days) {
		Workers workers = workersFeignClient.findById(id).getBody();
		return new Payment(workers.getName(), workers.getDailyIncome(), days);
	}
}
