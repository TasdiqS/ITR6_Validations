package com.validations.checking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validations.checking.entities.NatureOfBusiness;

public interface NatureOfBusinessDao  extends JpaRepository<NatureOfBusiness, Integer>{

}
