class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int[nums.length];
        int inc=0;
        for(int i=0;i<n;i++){
            arr[inc++]=nums[i];
            arr[inc++]=nums[i+n];
        }
        return arr;
    }
}