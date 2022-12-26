package com.claramoreira.teampro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claramoreira.teampro.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
