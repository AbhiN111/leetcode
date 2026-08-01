// class Solution {
//     public int fib(int n) {
//         if (n<=1){
//             return n;
//         }
//         int last = (n-1);
//         int slast = (n-2);
//         return last + slast;
//     }

//     System.out.println(fib(4));
// }

// import java.util.Scanner;

// public class Solution {

//     public static int fib(int n){
//         if (n<=1){
//             return n;
//         }
//         return fib(n-1) + fib(n-2); 
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n= sc.nextInt();
        
//         System.out.println(fib(n));
        
//     }
// }

import java.util.Scanner;

public class Solution{

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}