package com.example.anagram.controller;

import com.example.anagram.model.AnagramRequest;
import com.example.anagram.service.AnagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anagrams")
public class AnagramController {

    @Autowired
    private AnagramService anagramService;

    @PostMapping
    public ResponseEntity<?> generateAnagrams(@RequestBody AnagramRequest request) {
        String letters = request.getLetters();

        // Input validation
        if (letters == null || letters.isEmpty()) {
            return ResponseEntity.badRequest().body("Input must not be empty.");
        }
        if (!letters.matches("^[a-zA-Z]+$")) {
            return ResponseEntity.badRequest().body("Input must contain only letters.");
        }

        List<String> result = anagramService.generateAnagrams(letters.toLowerCase());
        return ResponseEntity.ok(result);
    }
}
