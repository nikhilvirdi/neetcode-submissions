class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max = 0;
        int l=0;
        int r=n-1;
        while(l<r){
            int w=r-l;
            int h=Math.min(heights[r],heights[l]);
            int area=w*h;
            max=Math.max(area,max);
            if(heights[l]<heights[r]) l++;
            else r--;
        }
        return max;
    }
}
