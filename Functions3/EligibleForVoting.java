
import java.util.Scanner;

public class EligibleForVoting {
    public static String Voting(int n){
        if(n>18){
            return "Eligible";
        }
        else{
            return "Not Eligible";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Voting(n));
    }
}
