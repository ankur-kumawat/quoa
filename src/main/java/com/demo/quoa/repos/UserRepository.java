package com.demo.quoa.repos;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.quoa.entities.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, String> {
	
}
