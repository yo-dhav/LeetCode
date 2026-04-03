class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> visited = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int comp = target - nums[i];
            if (visited.containsKey(comp)) {
                return new int[] {i,visited.get(comp)};
            } else {
                visited.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}