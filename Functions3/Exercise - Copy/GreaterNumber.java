//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class GreaterNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GreaterNumber(a, b));
    }
    public static int GreaterNumber(int a , int b){
        if(a>b){
            return a;
        }
        return b;
    
    }
}
