class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
    int comp=target-nums[i];
       if (map.containsKey(comp))
       { 
        //return of the indices
                return new int[] {map.get(comp), i};
            }
        // Adding current number and index to the map
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
}
}