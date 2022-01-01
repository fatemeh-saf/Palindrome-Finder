# Palindrome-Finder
Repo of code to get a string from the user and print all palindromic substrings along with their starting position and length, sorted by their length

# User Instruction: 
  -run the Main.java class and type string to find it's palindrome substrings in the console and hit enter

# Assumptions:
   -String is all capital letters with no punctuations
   -if a palindromic substring includes inner palindromes, current output returns only the main palindromic substrings
    (e.g. RACECAR includes CEC but CEC is not printed in the output)
   -if all palindromic substring with inner palindromes are needed:
       -comment out the findPalindrome methods in findAllPalindromicSubstrings
       -uncomment the findInnerPalindrome method in findAllPalindromicSubstrings
