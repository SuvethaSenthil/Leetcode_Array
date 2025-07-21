import java.util.Arrays;
import java.util.Scanner;

public class Pascal_Triangle_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfRows = sc.nextInt();
        System.out.println(Arrays.deepToString(pascalTriangle(numOfRows)));
    }
    public static int[][] pascalTriangle(int numOfRows){
        int[][] triangle = new int[numOfRows][numOfRows];
        for(int i = 0;i < numOfRows;i++){
            for(int j = 0;j <= i;j++){
                if(j == 0 || j == i){
                    triangle[i][j] = 1;
                }
                else{
                    triangle[i][j] = triangle[i -1][j - 1] + triangle[i - 1][j]; 
                }
            }
        }
        return triangle;
    }
}
