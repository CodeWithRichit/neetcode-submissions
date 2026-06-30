class Solution {
    public int search(int[] nums, int target) {
        int hi=nums.length-1,lo=0,mid=-1;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
    }
}
