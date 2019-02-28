package com.demo.quoa.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.quoa.entities.Interest;
import com.demo.quoa.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, java.lang.Integer> {
	//List<Question> findAllOrderByInterestId(List<Interest> interest);

	List<Question> findAllOrderByInterest(List<Interest> interests);
}
