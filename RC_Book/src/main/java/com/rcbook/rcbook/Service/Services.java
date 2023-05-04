package com.rcbook.rcbook.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcbook.rcbook.Model.Model_Entity;
import com.rcbook.rcbook.Repository.Repository_jpa;

@Service
public class Services {

	@Autowired
	private Repository_jpa repository;

	public List<Model_Entity> retrive() {
		return repository.findAll();
	}

	public Optional<Model_Entity> findOne(String id) {
		return repository.findById(id);
	}

	public Optional<Model_Entity> create(Model_Entity model) {
		if (repository.existsById(model.getVehicle_number())) {
			return Optional.empty();
		} else {
			return Optional.of(repository.save(model));
		}

	}

	public Optional<Model_Entity> Update(Model_Entity model) {
		if (repository.existsById(model.getVehicle_number())) {
			return Optional.of(repository.save(model));
		} else {
			return Optional.empty();
		}
	}

	public String Deletedata(String id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return id + "data deleted sucessfull";
		} else {
			return id + " Vehicle number not register ";
		}

	}

}
