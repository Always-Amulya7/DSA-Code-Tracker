
          Regular Expression Matching

          - Summary: This Java code implements a dynamic programming solution to the regular expression matching problem. It uses a 2D boolean array (dp) to store whether a substring of s matches a substring of p. The algorithm iteratively builds the dp array, considering cases where the pattern character is '*' (representing zero or more occurrences) or a regular character.  The final result, indicating whether the entire string s matches the entire pattern p, is stored in dp[m][n], where m and n are the lengths of s and p, respectively.

          - Time Complexity: O(mn), where m is the length of string s and n is the length of pattern p. This is because the nested loops iterate through all possible substring matches.
          - Space Complexity: O(mn) due to the use of the dp array which has dimensions (m+1) x (n+1) to store boolean values representing matching substrings. The space used is directly proportional to the product of input string and pattern lengths.
          