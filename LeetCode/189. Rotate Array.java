class Solution {
    public void rotate(int[] nums, int k) {
        int j=0;
        int[] num = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i < k) num[i] = nums[(nums.length - k) + i];
            else{
                num[i] = nums[j];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = num[i];
        }
    }
}