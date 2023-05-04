package com.rcbook.rcbook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcbook.rcbook.Model.Model_Entity;

public interface Repository_jpa extends JpaRepository<Model_Entity,String> {
    
}
