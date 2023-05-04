package com.rcbook.rcbook.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcbook.rcbook.Model.Model_Entity;
import com.rcbook.rcbook.Service.Services;

@RestController
@RequestMapping("/Api/student")
public class Controllers {

	@Autowired
	private Services services;

	@GetMapping
	public List<Model_Entity> lisofdata() {
		return services.retrive();
	}

	@GetMapping("{id}")
	public Optional<Model_Entity> singledata(@PathVariable("id") String id) {
		Optional<Model_Entity> Data = services.findOne(id);
		if (Data.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(Data.get());
		}

	}

	@PostMapping
	public Optional<Model_Entity> Create(@RequestBody Model_Entity model) {
		Optional<Model_Entity> Data = services.create(model);

		if (Data.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(Data.get());
		}
	}

	@PutMapping
	public String update(@RequestBody Model_Entity model) {
		Optional<Model_Entity> Data = services.Update(model);
		if (Data.isPresent()) {
			return "Data sucessfull update";
		} else {
			return "Please Enter the correct Vehicle number";
		}

	}

	@DeleteMapping("{id}")
	public String delete(@PathVariable("id") String id) {
		return services.Deletedata(id);
	}

}
