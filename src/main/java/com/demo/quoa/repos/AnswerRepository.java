package com.demo.quoa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.quoa.entities.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
