package com.RESTFULL.WEBSERVICES.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;

@RestController
public class UserResource {
	@Autowired
	public UserDaoService data;

	@GetMapping("/users")
	public List<User> retieveAllData() {
		return data.findall();
	}

	@GetMapping("/users/{id}")

	public User retrieveUser(@PathVariable int id) {
		User user = data.findOne(id);
		
		if(user==null)
			throw new UserNotFoundException("id-"+id);
		return user;
	}
    @DeleteMapping ("/users/{id}")

    public void deleteUser(@PathVariable int id) {
        User user = data.deleteById(id);

        if(user==null)
            throw new UserNotFoundException("id-"+id);
    }

	@PostMapping("/users")
	public ResponseEntity<Object> createuser(@Valid @RequestBody User user) {
		User saveduser = data.save(user);
	
	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveduser.getId()).toUri();
	 return ResponseEntity.created(location).build();
}
}