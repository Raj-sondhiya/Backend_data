package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")  // Enable CORS for this method
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    
    @PostMapping("/api/saveData")
    public ResponseEntity<?> saveData(@RequestBody User user) {
        // Save the received data to MySQL
        userRepository.save(user);
        return ResponseEntity.ok("Data saved successfully");
    }
}
