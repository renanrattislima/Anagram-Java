package com.example.anagram.service;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AnagramServiceTest {

    private final AnagramService service = new AnagramService();

    @Test
    void testAnagramWithThreeLetters() {
        List<String> result = service.generateAnagrams("abc");
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("cba"));
    }

    @Test
    void testAnagramWithSingleLetter() {
        List<String> result = service.generateAnagrams("x");
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    void testAnagramWithEmptyString() {
        List<String> result = service.generateAnagrams("");
        assertTrue(result.isEmpty());
    }
}
