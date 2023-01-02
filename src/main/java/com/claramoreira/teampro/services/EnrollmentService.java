package com.claramoreira.teampro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claramoreira.teampro.domain.Enrollment;
import com.claramoreira.teampro.domain.User;
import com.claramoreira.teampro.exceptions.ObjectNotFoundException;
import com.claramoreira.teampro.repositories.EnrollmentRepository;

@Service
public class EnrollmentService {

	@Autowired
	private EnrollmentRepository repository;

	public List<Enrollment> findAll() {
		return repository.findAll();
	}

	public Enrollment findById(Integer id) {
		Optional<Enrollment> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

}
