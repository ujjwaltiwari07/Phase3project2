package com.example.feed.repository;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.example.feed.entities.Feedback;


@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}