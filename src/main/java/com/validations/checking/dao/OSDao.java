package com.validations.checking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validations.checking.entities.OS;



public interface OSDao extends JpaRepository<OS, Integer> {

}
