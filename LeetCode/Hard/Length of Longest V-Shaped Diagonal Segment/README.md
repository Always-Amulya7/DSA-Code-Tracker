3459. Length of Longest V-Shaped Diagonal SegmentSolvedHardTopicsCompaniesHintYou are given a 2D integer matrix grid of size n x m, where each element is either 0, 1, or 2.

A V-shaped diagonal segment is defined as:


	The segment starts with 1.
	The subsequent elements follow this infinite sequence: 2, 0, 2, 0, ....
	The segment:
	
		Starts along a diagonal direction (top-left to bottom-right, bottom-right to top-left, top-right to bottom-left, or bottom-left to top-right).
		Continues the sequence in the same diagonal direction.
		Makes at most one clockwise 90-degree turn to another diagonal direction while maintaining the sequence.
	
	




Return the length of the longest V-shaped diagonal segment. If no valid segment exists, return 0.

 
Example 1:


Input: grid = [[2,2,1,2,2],[2,0,2,2,0],[2,0,1,1,0],[1,0,2,2,2],[2,0,0,2,2]]

Output: 5

Explanation:



The longest V-shaped diagonal segment has a length of 5 and follows these coordinates: (0,2) → (1,3) → (2,4), takes a 90-degree clockwise turn at (2,4), and continues as (3,3) → (4,2).


Example 2:


Input: grid = [[2,2,2,2,2],[2,0,2,2,0],[2,0,1,1,0],[1,0,2,2,2],[2,0,0,2,2]]

Output: 4

Explanation:



The longest V-shaped diagonal segment has a length of 4 and follows these coordinates: (2,3) → (3,2), takes a 90-degree clockwise turn at (3,2), and continues as (2,1) → (1,0).


Example 3:


Input: grid = [[1,2,2,2,2],[2,2,2,2,0],[2,0,0,0,0],[0,0,2,2,2],[2,0,0,2,0]]

Output: 5

Explanation:



The longest V-shaped diagonal segment has a length of 5 and follows these coordinates: (0,0) → (1,1) → (2,2) → (3,3) → (4,4).


Example 4:


Input: grid = [[1]]

Output: 1

Explanation:

The longest V-shaped diagonal segment has a length of 1 and follows these coordinates: (0,0).


 
Constraints:


	n == grid.length
	m == grid[i].length
	1 <= n, m <= 500
	grid[i][j] is either 0, 1 or 2.

 Seen this question in a real interview before?1/5YesNoAccepted27,365/53.5KAcceptance Rate51.2%TopicsArrayDynamic ProgrammingMemoizationMatrixWeekly Contest 437CompaniesHint 1Use dynamic programming to determine the best point to make a 90-degree rotation in the diagonal path while maintaining the required sequence.Hint 2Represent dynamic programming states as (row, col, currentDirection, hasMadeTurnYet). Track the current position, direction of traversal, and whether a turn has already been made, and take transitions accordingly to find the longest V-shaped diagonal segment.Discussion (138)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestGaurav KumarJun 09, 2025Kanye would love the first picture :) Read more175Amr Samy10 hours agoMy 3-day streak ends here. Read more1469Aradhya Verma10 hours agoI think i should work at Burger king Read more905parthasarathireddy10 hours agoToday is Vinayaka Chaturthi. LeetCode decided not to let us celebrate by giving a hard problem. Anyway, wishing you all a Happy Vinayaka Chavithi! Read more2248amcodes2k2Feb 16, 2025Can someone explain to me how the answer to the testcase [[1,1,1,2,0,0],[0,0,0,0,1,2]] is 2? Shouldn't it be 3 [(1, 4) -> (0, 3) -> (1,2)]?
Edit: Finally got it. The rotation must be clockwise as mentioned by some of the users in the replies. It was my mistake I didn't read the question carefully. Read more327cache_2110 hours agoBased on the second part of that first image, I'm guessing this is a question you can expect to get from Telsa or X Read more412sixplosive9 hours agoheil leetcode!! Read more17Aashutosh SinghFeb 16, 2025I can't believe i was able to solve it, such a Good morning it is. IMO Q3 was difficult than Q4 Read more175Vitaliy Cherkasskiy6 hours ago
Sees the first picture
sighs
Goes into the comment section
 Read more14Viktor KustovFeb 17, 2025I'm the only one, who missed that the next step after 1 must be exactly 2, not 0 or 2? It cost me 2 hours of useless debugging... )) Read moreTip113123414Copyright © 2025 LeetCode. All rights reserved.