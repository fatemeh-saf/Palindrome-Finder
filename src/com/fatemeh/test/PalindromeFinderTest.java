package com.fatemeh.test;

import com.fatemeh.PalindromeFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;


class PalindromeFinderTest {

    Map<String,Integer> map=new HashMap<>();
    Map<String,Integer> expected;
    String testCase;


    @Test
    void findAllPalindromicSubstrings_with_odd_pal() {
        //arrange
        testCase="KLABCBADGF";
        map.put("ABCBA",2);

        //act
        expected= PalindromeFinder.findAllPalindromicSubstrings(testCase);

        //assert
        assertNotNull(expected);
        assertTrue(expected.equals(map));

    }

    @Test
    void findAllPalindromicSubstrings_with_even_pal() {
        //arrange
        testCase="KLABBADGF";
        map.put("ABBA",2);

        //act
        expected= PalindromeFinder.findAllPalindromicSubstrings(testCase);

        //assert
        assertNotNull(expected);
        assertTrue(expected.equals(map));
    }

    @Test
    void findAllPalindromicSubstrings_with_odd_and_even_pal() {
        //arrange
        testCase="KLABBADGFRACECAR";
        map.put("ABBA",2);
        map.put("RACECAR",9);

        //act
        expected= PalindromeFinder.findAllPalindromicSubstrings(testCase);

        //assert
        assertNotNull(expected);
        assertTrue(expected.equals(map));
    }

    @Test
    void findAllPalindromicSubstrings_with_no_pal() {
        //arrange
        testCase="KLABCDGF";

        //act
        expected= PalindromeFinder.findAllPalindromicSubstrings(testCase);

        //assert
        assertNotNull(expected);
        assertTrue(expected.isEmpty());
        assertTrue(expected.equals(map));
    }

    @Test
    void findAllPalindromicSubstrings_with_empty_str() {
        //arrange
        testCase="";

        //act
        expected= PalindromeFinder.findAllPalindromicSubstrings(testCase);

        //assert
        assertNotNull(expected);
        assertTrue(expected.isEmpty());
        assertTrue(expected.equals(map));
    }



}