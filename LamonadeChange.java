public class LamonadeChange {
    public static void main(String[] args){
        int[] bills = {5,5,5,10,20};
        System.out.println(lamonadeChange(bills));
    }
    public static boolean lamonadeChange(int[] bills){
        int fiveDollars = 0,tenDollars = 0;
        for(int bill : bills){
            if(bill == 5){
                fiveDollars++;
            }
            else if(bill == 10){
                if(fiveDollars == 0){
                    return false;
                }
                fiveDollars--;
                tenDollars++;
            }
            else{
                if(fiveDollars > 0 && tenDollars > 0){
                    fiveDollars--;
                    tenDollars--;
                }
                else if(fiveDollars >= 3){
                    fiveDollars -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
