class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] num = new  int[n + 1];
        Arrays.fill(num, -1);
        for(int i=0;i<n;i++){
            num[nums[i]] = nums[i];
        }
        for(int i=0;i<n+1;i++){
            if(num[i] == -1) return i;
        }
        return 0;
    }
}