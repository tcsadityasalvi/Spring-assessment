package com.tcs.spring.assessment.service;

import javax.validation.Valid;
import com.tcs.spring.assessment.entity.Question;
import com.tcs.spring.assessment.entity.User;

public interface IQuestionService {

	Question saveQuestion(Question ques);

	Iterable<Question> getAll();

	void deleteQuestion(Integer id);

	String updateAnswers(Question ques, Integer id);

	String upvote(Question ques, Integer id);
	
}
