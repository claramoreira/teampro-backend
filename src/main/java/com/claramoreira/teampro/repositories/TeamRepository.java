package com.claramoreira.teampro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claramoreira.teampro.domain.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
