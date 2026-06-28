class Solution {
    public int removeElement(int[] nums, int val) {
        int vc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                vc++;
            }
        }
        int remain=nums.length-vc;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return remain;
    }
}