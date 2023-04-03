package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ComplaintUpdates;
import com.example.demo.repo.ComplaintUpdateRepository;

@Service
public class ComplaintUpdateService {
	
	@Autowired
	ComplaintUpdateRepository repo;
	
	public ComplaintUpdates addComplaintUpdates(ComplaintUpdates compUpdate) {
		compUpdate = repo.save(compUpdate);
		if (compUpdate != null) {
			compUpdate = getComplaintUpdatesById(compUpdate.getId());
		}
		return compUpdate;
	}

	public List<ComplaintUpdates> getAllComplaintUpdates() {
		return repo.findAll();
	}

	public ComplaintUpdates getComplaintUpdatesById(int id) {
		if (repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return null;
	}
}