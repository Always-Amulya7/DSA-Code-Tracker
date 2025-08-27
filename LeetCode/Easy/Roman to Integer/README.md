13. Roman to IntegerSolvedEasyTopicsCompaniesHintRoman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:


	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.


Given a roman numeral, convert it to an integer.

 
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.


Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.


Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


 
Constraints:


	1 <= s.length <= 15
	s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
	It is guaranteed that s is a valid roman numeral in the range [1, 3999].

 Seen this question in a real interview before?1/5YesNoAccepted5,122,259/7.8MAcceptance Rate65.3%TopicsHash TableMathStringCompaniesHint 1Problem is simpler to solve by working the string from back to front and using a map.Similar QuestionsInteger to RomanMediumDiscussion (510)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestalienfuyuDec 09, 2022I find a little bit nonsense to try to use the less memory and CPU possible. A good solution is not the most efficient one but a balance between clean code / readability and performance. Being a one liner is not to be smart, it's having a ego two mountains tall. Let's not forget we code for others. Read more81318samikshagodghate22Apr 23, 2024who tf said its easy Read more73819KhaledLeetFeb 01, 2023My first problem on leetcode :) Read more69926Numaira NawazJun 22, 2023My third problem on leetcode :)
but it doesn't look easy :( Read more40820HappyJun 12, 2016I dont quite understand why the frequency of this problem appeared in real interview is so high.
What this problem test us?
I don't think anyone familiar with the law of roman numbers. Read more26813Derek PapierskiDec 17, 2022as a beginner, here are some python hints that might help other newbies start off in the right direction:

use a dictionary for the roman numeral values
use enumerate when iterating through the input string (i always forget to use this)
to distinguish "VI"=6, but "IV"=4, you need to see if the numeric value of the next character is greater than the numeric value of the current character
 Read moreTip3378AlgoEngineApr 28, 2023Video that visualizes two different solutions:
 Read moreTip1075kaiyu-CNAug 14, 2024This is my first algorithm question . I have spent two weeks to solve it . Although the time I spent is so long but when I accomplish it completely , I feel satisfied and delighted . I am writing these words in the hope of keeping a memory. I know that Leetcode has many excellent programmer predecessor, and I want to learn from them. I hope that in the future, I can solve algorithm problems faster and faster, and I also hope that my future self can thank the hardworking self now. Keep up the good work! Read more1017JackyMay 04, 2020The roman numeral for 49 is "XLIX".
Reference:

https://roman-numerals.info/49
https://www.rapidtables.com/math/symbols/roman-numerals-1-100.html
https://www.calculateme.com/roman-numerals/to-roman/49

HOWEVER, LeetCode's answer is IL which is wrong according to references cited above. It is also wrong according to their own problem descritpion wherein thay stated:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.

Granted, the above description is vague enought that it does not explicity state that "I" cannot be placed before "L" or "C" but I think it can be assumed. Read more726iL YDOCSep 12, 2020Tried "IM" which is not a valid Roman numeral in the testcase console, and it says Expected: 999
Shouldn't such case return None or -1 to indicate invalid input? Read more4213123451Copyright © 2025 LeetCode. All rights reserved.