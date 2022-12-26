package com.claramoreira.teampro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claramoreira.teampro.domain.Team;
import com.claramoreira.teampro.domain.User;
import com.claramoreira.teampro.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository repository;

	public List<Team> findAll() {
		return repository.findAll();
	}

}
