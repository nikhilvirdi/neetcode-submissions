class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int x: nums) set.add(x);
        if(set.size()!=n) return true;
        return false;
    }
}