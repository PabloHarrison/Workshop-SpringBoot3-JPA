package com.pabloharrison.courseSpringBoot.resources;

import com.pabloharrison.courseSpringBoot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "maria", "maria@gmail.com", "980765675", "4567");
        return ResponseEntity.ok().body(u);
    }
}
