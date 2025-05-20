package com.example.anagram.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnagramService {

    /**
     * Generates all permutations (anagrams) of a given string.
     *
     * @param input a string of distinct letters
     * @return list of all anagrams
     */
    public List<String> generateAnagrams(String input) {
        List<String> result = new ArrayList<>();
        if (input == null || input.isEmpty()) return result;
        permute("", input, result);
        return result;
    }

    private void permute(String prefix, String remaining, List<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permute(newPrefix, newRemaining, result);
        }
    }
}
