package com.claramoreira.teampro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claramoreira.teampro.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	// TODO: REMOVE PASSWORD FROM RESPONSE
	@Query(value = "select u.id, u.name, u.password, u.email from teampro.users u inner join teampro.enrollments e on u.id = e.user_id inner join teampro.teams t on e.team_id = t.id where t.id = ?1", nativeQuery = true)
	List<User> findByTeam(Integer teamId);

}
