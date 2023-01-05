package com.claramoreira.teampro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claramoreira.teampro.domain.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

	@Query(value = "select t.id, t.name from teampro.users u inner join teampro.enrollments e on u.id = e.user_id inner join teampro.teams t on e.team_id = t.id where u.id = ?1", nativeQuery = true)
	List<Team> findByUser(Integer userId);

}
