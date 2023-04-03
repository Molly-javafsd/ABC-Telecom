package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ComplaintUpdates;

public interface ComplaintUpdateRepository extends JpaRepository<ComplaintUpdates, Integer> {

}
