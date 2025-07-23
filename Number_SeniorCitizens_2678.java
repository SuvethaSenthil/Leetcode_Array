import java.util.Arrays;

public class Number_SeniorCitizens_2678 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(numberSeniorCitizens(details));
    }
    public static int numberSeniorCitizens(String[] details){
        return (int)Arrays.stream(details).filter(str -> Integer.parseInt(str.substring(11,13)) > 60).count();
    }
}
