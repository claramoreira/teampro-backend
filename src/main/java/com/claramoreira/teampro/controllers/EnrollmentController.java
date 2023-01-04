package com.claramoreira.teampro.controllers;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claramoreira.teampro.domain.Enrollment;
import com.claramoreira.teampro.domain.Team;
import com.claramoreira.teampro.domain.User;
import com.claramoreira.teampro.services.EnrollmentService;
import com.claramoreira.teampro.services.UserService;

@RestController
@RequestMapping(value = "/enrollments")
public class EnrollmentController {

	@Autowired
	private EnrollmentService service;

	@GetMapping
	public ResponseEntity<List<Enrollment>> findAll() {
		List<Enrollment> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Enrollment> findById(@PathVariable Integer id) throws AttributeNotFoundException {
		Enrollment obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
