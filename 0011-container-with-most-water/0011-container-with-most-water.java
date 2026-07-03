class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;

        int i=0;
        int j = height.length-1;
        while(i < j){
            int area = Math.min(height[i], height[j]) * (j-i);
            System.out.println(area);      
            maxArea = Math.max(maxArea, area);
            System.out.println(maxArea);      

            if(height[i] > height[j]){
                j--;
            } else if(height[i] < height[j]){
                i++;
            } else {
                i++;
                j--;
            }
        }
        return maxArea;
    }
}