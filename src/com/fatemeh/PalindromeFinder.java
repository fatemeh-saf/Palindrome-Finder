package com.fatemeh;

import java.util.*;
import java.util.stream.Collectors;

public class PalindromeFinder {

    /**
     * Find all palindromic substrings in a string, including odd and even length palindromes
     * @param str: String
     * Time Complexity: O(n2)
     * Space Complexity: O(n)
     */
    public static Map<String,Integer> findAllPalindromicSubstrings(String str)
    {
        Map<String,Integer> map=new HashMap<>();

        if(str==null) return null;

        for (int i = 0; i < str.length(); i++)
        {
            // find all odd length palindromes centered at ith character
            findPalindrome(str, i, i, map);
            //findInnerPalindrome(str,i,i,map);

            // find all even length palindrome centered at ith and ith+1 character
            findPalindrome(str, i, i + 1, map);
            //findInnerPalindrome(str,i,i+1,map);
        }

        Map<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparingInt(String::length).reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return result;

    }


    /**
     * Find the longest palindrome centered at ith character by moving the pointer to right and left of i
     * @param str: substring to check for longest palindrome
     * @param left: left pointer
     * @param right: right pointer
     * @param map: map collection with substring as key and substring starting position as value to add found palindrome
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static void findPalindrome(String str, int left, int right, Map<String,Integer>map)
    {
        while (left >= 0 && right < str.length()
                && str.charAt(left) == str.charAt(right))
        {
            left--;
            right++;
        }
        left++;
        right--;

        if(right-left+1>1){
            map.put(str.substring(left, right + 1),left);
        }

    }


    /**
     * Find the all palindromes centered at ith character by moving the pointer to right and left of i
     * @param str: substring to check for all palindrome
     * @param left: left pointer
     * @param right: right pointer
     * @param map: map collection with substring as key and substring starting position as value to add found palindrome
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    private static void findInnerPalindrome(String str, int left, int right, Map<String,Integer>map)
    {
        while (left >= 0 && right < str.length()
                && str.charAt(left) == str.charAt(right))
        {
            if(right-left+1>1){
            map.put(str.substring(left, right + 1),left);
        }
            left--;
            right++;

        }
    }


}
