/** There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies. **/



// Leetcode Solution

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>ans = new ArrayList<Boolean>();
        int max_val = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max_val = Math.max(max_val,candies[i]);
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max_val){
                ans.add(i,true);
            }
            else{
                ans.add(i,false);
            }
        }
        return ans;
    }
}
