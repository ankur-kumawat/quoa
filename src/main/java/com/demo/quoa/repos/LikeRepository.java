package com.demo.quoa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.quoa.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Integer> {

}
