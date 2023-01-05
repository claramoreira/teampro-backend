package com.claramoreira.teampro.controllers;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.claramoreira.teampro.domain.Team;
import com.claramoreira.teampro.services.TeamService;

@RestController
@RequestMapping(value = "/teams")
public class TeamController {

	@Autowired
	private TeamService service;

	@GetMapping
	public ResponseEntity<List<Team>> findAll() {
		List<Team> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Team> findById(@PathVariable Integer id) throws AttributeNotFoundException {
		Team obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value= "/users/{id}")
	public ResponseEntity<List<Team>> findByUser(@PathVariable Integer id) throws AttributeNotFoundException {
		System.out.println("Im here");
		List<Team> list = service.findByUser(id);
		return ResponseEntity.ok().body(list);
	}

}
