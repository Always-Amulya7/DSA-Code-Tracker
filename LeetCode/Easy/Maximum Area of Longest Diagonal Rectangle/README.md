3000. Maximum Area of Longest Diagonal RectangleEasyTopicsCompaniesHintYou are given a 2D 0-indexed integer array dimensions.

For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.

Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.

 
Example 1:

Input: dimensions = [[9,3],[8,6]]
Output: 48
Explanation: 
For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48.


Example 2:

Input: dimensions = [[3,4],[4,3]]
Output: 12
Explanation: Length of diagonal is the same for both which is 5, so maximum area = 12.


 
Constraints:


	1 <= dimensions.length <= 100
	dimensions[i].length == 2
	1 <= dimensions[i][0], dimensions[i][1] <= 100

 Seen this question in a real interview before?1/5YesNoAccepted166,224/363.6KAcceptance Rate45.7%TopicsArrayWeekly Contest 379CompaniesHint 1Diagonal of rectangle is sqrt(length2 + width2).Discussion (129)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestJedmengAug 26, 2025This is my 1000th POTD 😝
 Read more29116DamonJul 10, 2025Optimisation tip:
Don't need to calculate the root
sqrt(x^2+y^2) can just become x^2 + y^2
sqrt is quite demanding for performance, so this can be a good optimisation Read moreTip11910NerverAug 26, 2025Acceptance rate is low because people (including myself) can't read 🤡 Read more1145SmarikaJan 11, 2024Try this test case b4 submitting
Good day :))
dimensions =
[[4,7],[8,9],[5,3],[6,10],[2,9],[3,10],[2,2],[5,8],[5,10],[5,6],[8,9],[10,7],[8,9],[3,7],[2,6],[5,1],[7,4],[1,10],[1,7],[6,9],[3,3],[4,6],[8,2],[10,6],[7,9],[9,2],[1,2],[3,8],[10,2],[4,1],[9,7],[10,3],[6,9],[9,8],[7,7],[5,7],[5,4],[6,5],[1,8],[2,3],[7,10],[3,9],[5,7],[2,4],[5,6],[9,5],[8,8],[8,10],[6,8],[5,1],[10,8],[7,4],[2,1],[2,7],[10,3],[2,5],[7,6],[10,5],[10,9],[5,7],[10,6],[4,3],[10,4],[1,5],[8,9],[3,1],[2,5],[9,10],[6,6],[5,10],[10,2],[6,10],[1,1],[8,6],[1,7],[6,3],[9,3],[1,4],[1,1],[10,4],[7,9],[4,5],[2,8],[7,9],[7,3],[4,9],[2,8],[4,6],[9,1],[8,4],[2,4],[7,8],[3,5],[7,6],[8,6],[4,7],[25,60],[39,52],[16,63],[33,56]] Read more393Sam_ORAug 26, 20252012 type interview question: Read moreFeedback361Shivam KumarSep 13, 2024I can't understand why has this problem such a low acceptance rate !? It isn't even a lil bit tough..! Read more246Anish SachdevaJul 07, 2024The problem description needs to be fixed !! it says:
If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.
i would assume having the maximum area means maximum among all rectangles, but apparently this means maximum among rectangles with same max diagonal length. This is hyper slippery ground !!! and needs to be fixed asap. Cost me a good 30 mins. Read more557Hritam ChowdhuryJan 07, 2024one test case is failing
[[4,7],[8,9],[5,3],[6,10],[2,9],[3,10],[2,2],[5,8],[5,10],[5,6],[8,9],[10,7],[8,9],[3,7],[2,6],[5,1],[7,4],[1,10],[1,7],[6,9],[3,3],[4,6],[8,2],[10,6],[7,9],[9,2],[1,2],[3,8],[10,2],[4,1],[9,7],[10,3],[6,9],[9,8],[7,7],[5,7],[5,4],[6,5],[1,8],[2,3],[7,10],[3,9],[5,7],[2,4],[5,6],[9,5],[8,8],[8,10],[6,8],[5,1],[10,8],[7,4],[2,1],[2,7],[10,3],[2,5],[7,6],[10,5],[10,9],[5,7],[10,6],[4,3],[10,4],[1,5],[8,9],[3,1],[2,5],[9,10],[6,6],[5,10],[10,2],[6,10],[1,1],[8,6],[1,7],[6,3],[9,3],[1,4],[1,1],[10,4],[7,9],[4,5],[2,8],[7,9],[7,3],[4,9],[2,8],[4,6],[9,1],[8,4],[2,4],[7,8],[3,5],[7,6],[8,6],[4,7],[25,60],[39,52],[16,63],[33,56]]
what is the problem in the solution:
class Solution {
public:
int areaOfMaxDiagonal(vector<vector>& dimensions) {
    int maxArea=0;
    double maxD = 0;
    int n = dimensions.size();
    int l,b;
    double d;
    
    for(int i=0;i<n;i++) {
        
         l = dimensions[i][0];
         b = dimensions[i][1];
         d = sqrt(l*l + b*b);
        // cout<<d<<",";
        if(d>=maxD) {
            maxArea = l*b;
            maxD=d;
        } 
    }
    
    return maxArea;
    
}
}; Read more175Yuyi_HaoJan 09, 2024good question to test conditional logic Read more151Azhar Uddin SheikhJan 09, 2024some test cases
[[4,10],[4,9],[9,3],[10,8]]
[[2,6],[5,1],[3,10],[8,4]]
[[25,60], [39,52], [33,56], [16,63]]
[[6,5],[8,6],[2,10],[8,1],[9,2],[3,5],[3,5]] Read more14123413Copyright © 2025 LeetCode. All rights reserved.