package com.validations.checking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validations.checking.entities.ITR6Validation;

public interface ValidationDao extends JpaRepository<ITR6Validation, Integer> {

}
