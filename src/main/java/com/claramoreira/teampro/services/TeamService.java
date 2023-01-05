package com.claramoreira.teampro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claramoreira.teampro.domain.Team;
import com.claramoreira.teampro.exceptions.ObjectNotFoundException;
import com.claramoreira.teampro.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository repository;

	public List<Team> findAll() {
		return repository.findAll();
	}

	public Team findById(Integer id) {
		Optional<Team> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

	public List<Team> findByUser(Integer userId) {
		List<Team> list = repository.findByUser(userId);
		return list;
	}

}
