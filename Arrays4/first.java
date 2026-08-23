// TAKE AN ARRAY AS INPUT FROM USER . SEARCH FOR A GIVEN NUMBER X AND PRINT THE INDEX AT WHICH IT OCCURS

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i=0 ; i<size ; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0 ; i<numbers.length ; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }
    }
}