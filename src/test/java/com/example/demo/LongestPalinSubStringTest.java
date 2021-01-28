package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.LongestPalinSubstring;

public class LongestPalinSubStringTest {

    @Test
    public void shouldPass() throws Exception {
        assertEquals(12, LongestPalinSubstring.longestPalinSubstr("HelloWelcomeemoclewHelloolle"));
    }
    
    @Test
    public void shouldPassEmpty() throws Exception {
    	assertEquals(0, LongestPalinSubstring.longestPalinSubstr(""));
    }
}
