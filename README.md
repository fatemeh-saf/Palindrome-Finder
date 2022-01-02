# Palindrome-Finder
Repo of code to find and print all palindromic substrings in the given string along with their starting position and length, sorted by their length

# User Instruction: 
  -run the Main.java class. Type string in the console and hit enter to find it's palindrome substrings

# Assumptions:
   -String is all capital letters with no punctuations
   -if a palindromic substring includes inner palindromes, current output returns only the main palindromic substrings
    (e.g. RACECAR includes CEC but CEC is not printed in the output)
   -if all palindromic substring with inner palindromes are needed:
       -comment out the findPalindrome methods in findAllPalindromicSubstrings
       -uncomment the findInnerPalindrome method in findAllPalindromicSubstrings
