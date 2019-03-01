package com.demo.quoa.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.quoa.entities.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {

}
