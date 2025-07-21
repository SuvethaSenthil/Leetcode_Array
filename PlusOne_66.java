import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        //int[] digits = {1,2,9};
        //int[] digits = {9,9,9};// the loop terminates at the end.after => update the size + 1
        plusOne(digits);
        for(int digit : digits){
            System.out.print(digit + " ");
        }
    }
    public static int[] plusOne(int[] digits){
        for(int i = digits.length - 1;i >= 0;i--){
            if(digits[i] + 1 < 10){
                digits[i] += 1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
