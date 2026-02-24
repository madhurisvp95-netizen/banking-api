package com.example.demo.controller;

import com.example.demo.model.CustomerDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
 @RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:3000") // React default port

public class LoginController {

        @GetMapping("/hello")
        public String hello() {
            return "Backend is working!";
        }

        @PostMapping("/loginUser")
        public ResponseEntity<String> loginUSer(@RequestBody CustomerDetails request) {
            return ResponseEntity.ok("User details :"+request.getCustomerId()
            );
        }
}
