class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int cnt=0;
       int max=0;
        int j=0;
       while(j<nums.length){
        
        if(nums[j]==1){
            max++;
            cnt =Math.max(max,cnt);
        }else{
            max=0;
        }
        j++;
       }
        return cnt;
    }
}