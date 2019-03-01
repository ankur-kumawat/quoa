package com.demo.quoa.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.quoa.entities.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
