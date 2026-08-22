
//Write a function that takes in the radius as input and returns the circumference of a circle.


import java.util.*;

public class CircumferenceOfCircle {
    
    public static double Circumference(int r){
        double pi = 3.14; 
        double c = 2 * pi * r;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print(Circumference(r));
    }
    
}
