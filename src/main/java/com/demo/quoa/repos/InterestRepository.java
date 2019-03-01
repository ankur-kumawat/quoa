package com.demo.quoa.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.quoa.entities.Interest;

@Repository
public interface InterestRepository extends JpaRepository<Interest, Integer> {
	Optional<Interest> findByName(String name);
}
