package com.claramoreira.teampro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claramoreira.teampro.domain.Team;
import com.claramoreira.teampro.domain.User;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
	

}
