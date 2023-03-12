/*Q3 - Write a program to calculate the factorial of a number. (Easy)
        Explanation:
        Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n.
        E.g.-
        4! = 1*2*3*4 = 24
        3! = 3*2*1 = 6
        Also,
        1! = 1
        0! = 0
        Input1:
        5
        Output1:
        120
        Input2:
        1
        Output2:
        1                        */

import  java.util.Scanner ;
public class Assignment {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in) ;
        System.out.println("Enter any number ->");
        int n = kb.nextInt() ;
        long fact  = 1 ;

        for(int i = 2;i<=n ;i++)
            fact *= i ;

        System.out.println("Factorial -> "+fact);
    }
}
