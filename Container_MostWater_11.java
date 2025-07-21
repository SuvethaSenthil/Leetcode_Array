public class Container_MostWater_11{
    public static void main (String[] args){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerMostWater(heights));
    }
    public static int containerMostWater(int[] heights){
        int left = 0;
        int right = heights.length - 1;
        int max = -1;//???
        while ((left < right)) {
            int width = right - left;
            int height = Math.min(heights[left] , heights[right]);
            max = Math.max(max, width * height);
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}