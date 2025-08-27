6. Zigzag ConversionMediumTopicsCompaniesThe string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R


And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


 
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"


Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I


Example 3:

Input: s = "A", numRows = 1
Output: "A"


 
Constraints:


	1 <= s.length <= 1000
	s consists of English letters (lower-case and upper-case), ',' and '.'.
	1 <= numRows <= 1000

 Seen this question in a real interview before?1/5YesNoAccepted1,877,220/3.6MAcceptance Rate52.2%TopicsStringCompaniesDiscussion (461)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestwaitingtodieOct 26, 2017No details of what is required at all - it's almost like this:
given a string Idonthaveaclue, convert it to wtfareyoutalkingabout, and oh yes do it in a zig zag pattern. good luck.
When you have to spend more time working out the spec than working on the problem, it's a sign of a bad question. Read more2.6K35Manish SutharFeb 03, 2023Ironically, Paypal is laying off Read more1.2K8Bashishtha KannaujiyaFeb 03, 2023I am ignoring this question for a long time. Read more4836jc334259684Feb 03, 2023Don't think too much, use a 2D array to generate the pattern first, and then join characters of each row. Sometimes naive version works best Read moreTip21316Mark WatsonJun 13, 2024Note: the zig-zag pattern is like this y'all
|    /|    /|    /|
|  /  |  /  |  /  |
|/    |/    |/    | Read more1777milk1_0Feb 03, 2023Alien problem again today haha Read more1761Sergei PlaxienkoFeb 03, 2023The description better be changed to reflex the reality to "PAYPALISFIRING". Read moreFeedback1721VgnApr 21, 2015Dear LeetCode,
It will be a good idea  if you provide a detailed test case when there is a 'Run time error'. This will ease the things to debug, especially when the code runs perfectly fine on local machines but not on Leet Code.
Thanks. Read more1906LeetcodeProtectorFeb 03, 2023

Things changed pretty quickly. Read more461vigneshmFeb 05, 2014I see a lot of answers specific to the code, but I'm trying to understand what it generally means in LeetCode OJ Read more45123447Copyright © 2025 LeetCode. All rights reserved.