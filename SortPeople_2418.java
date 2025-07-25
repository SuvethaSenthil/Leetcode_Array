public class SortPeople_2418 {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] sortedNames = sortPeople(names, heights);
        System.out.println("Sorted names by height (descending):");
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
    public static String[] sortPeople(String[] names, int[] heights){
        for(int i = 0;i < heights.length;i++){
            boolean swapped = false;
            for(int j = 0;j < heights.length - i - 1;j++){
                if(heights[j] < heights[j + 1]){
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return names;
    }
}
