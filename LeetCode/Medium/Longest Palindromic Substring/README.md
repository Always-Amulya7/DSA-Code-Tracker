5. Longest Palindromic SubstringSolvedMediumTopicsCompaniesHintGiven a string s, return the longest palindromic substring in s.

 
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


Example 2:

Input: s = "cbbd"
Output: "bb"


 
Constraints:


	1 <= s.length <= 1000
	s consist of only digits and English letters.

 Seen this question in a real interview before?1/5YesNoAccepted4,094,396/11.3MAcceptance Rate36.3%TopicsTwo PointersStringDynamic ProgrammingCompaniesHint 1How can we reuse a previously computed palindrome to compute a larger palindrome?Hint 2If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?Hint 3Complexity based hint:
If we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.Similar QuestionsShortest PalindromeHardPalindrome PermutationEasyPalindrome PairsHardLongest Palindromic SubsequenceMediumPalindromic SubstringsMediumMaximum Number of Non-overlapping Palindrome SubstringsHardDiscussion (496)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestZenMasterVNov 05, 2022Seems like too many of the  coding wunderkinds here lack basic reading comprehension skills
" Please don't post any solutions in this discussion tab"
It's almost the rule to find the exact opposite for the discussion of every question. I don't want to see your damned solution! Read more1.3K13Akhil ChauhanOct 27, 2023More like longest palindromic nightmare Read more2191SwetNov 04, 2022It took me an hour to solve this even though it's not that difficult but anyhow came to the conclusion that I need to do more practice. Read more1273sanemdeepakJan 16, 2019For input "ac" test case is expecting "a" as output, how is just "a" a palindromic string? Read more17720Neetika BansalJun 04, 2014From the leetcode blog, one of the methods of solving this is:
A common mistake:
Some people will be tempted to come up with a quick solution, which is unfortunately flawed (however can be corrected easily):
Reverse S and become S’. Find the longest common substring between S and S’, which must also be the longest palindromic substring.
This seemed to work, let’s see some examples below.
For example,
S = “caba”, S’ = “abac”.
The longest common substring between S and S’ is “aba”, which is the answer.
Let’s try another example:
S = “abacdfgdcaba”, S’ = “abacdgfdcaba”.
The longest common substring between S and S’ is “abacd”. Clearly, this is not a valid palindrome.
We could see that the longest common substring method fails when there exists a reversed copy of a non-palindromic substring in some other part of S. To rectify this, each time we find a longest common substring candidate, we check if the substring’s indices are the same as the reversed substring’s original indices. If it is, then we attempt to update the longest palindrome found so far; if not, we skip this and find the next candidate.
Is this part correct?
example string: abcxycba
reverse string:  abcxycba
The substring indices are same as reversed string original indices and yet it is not a palindrome? Read more949napoleonNov 08, 2013My Solution Is Naive, It Cost O(n^2), Is there Any Solution faster? Read more10313Tomas SandvenApr 25, 2023I'm getting "Time Limit Exceeded" with 141/141 testcases passed and "Last Executed Input" is:
s =
Did I break it? Read moreFeedback47884danieNov 14, 2016I submitted my solution, and received a Time Limit Exceeded on this test case:
"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
So I copied and pasted the TC into a custom test case, and started to think about what I could tweak. However, I ended up accidentally hitting Run Code, but instead of getting a Time Limit Exceeded result, it passed:

Is this supposed to happen and I just need to make my code more efficient, or is this a bug?
 Read more4410miklerAug 25, 2017So I think I finally understood logic of test creators.
Even if you write a classical DP or memorization solution for this one you will timeout on latest tests.
I think they consider it edge cases. Because if you add one simple line it will pass! OMG.
I have leet code for this. Instead of solving problems I spend hours optimizing the constants.
if s == s[::-1]: return s Read more254AlgoEngineJun 17, 2023Visualization of "Expand from Centers" solution:
 Read more231123450Copyright © 2025 LeetCode. All rights reserved.