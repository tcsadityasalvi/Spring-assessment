package com.tcs.spring.assessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.spring.assessment.entity.User;

public interface IUserRepository extends CrudRepository<User, Integer> {

}
