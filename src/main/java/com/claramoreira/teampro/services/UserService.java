package com.claramoreira.teampro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claramoreira.teampro.domain.Team;
import com.claramoreira.teampro.domain.User;
import com.claramoreira.teampro.exceptions.ObjectNotFoundException;
import com.claramoreira.teampro.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

	public List<User> findByTeam(Integer teamId) {
		List<User> list = repository.findByTeam(teamId);
		return list;
	}
}
