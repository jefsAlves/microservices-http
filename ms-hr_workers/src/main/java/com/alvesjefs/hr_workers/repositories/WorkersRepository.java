package com.alvesjefs.hr_workers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.hr_workers.domain.Workers;

public interface WorkersRepository extends JpaRepository<Workers, Long> {

}