package com.tcs.spring.assessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.spring.assessment.entity.Question;

public interface IQuestionRepository extends CrudRepository<Question, Integer> {

}
