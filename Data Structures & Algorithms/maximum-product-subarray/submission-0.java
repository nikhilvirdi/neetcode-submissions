class Solution {
    public int maxProduct(int[] nums) {
        int cMax = nums[0];
        int cMin = nums[0];
        int mxP = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            int pMax = cMax;
            int pMin = cMin;
            cMax = Math.max(nums[i],Math.max(nums[i]*pMax,nums[i]*pMin));
            cMin = Math.min(nums[i],Math.min(nums[i]*pMax,nums[i]*pMin));
            mxP = Math.max(mxP,cMax);
        }
        return mxP;
    }
}
