// import java.util.Scanner;

// class Solution {

//     public static int reverse(int n) {
//         int rev = 0;

//         while (n != 0) {
//             int lastDigit = n % 10;
//             rev = rev * 10 + lastDigit;
//             n = n / 10;
//         }

//         return rev;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         System.out.println("Reversed Number: " + reverse(n));

//         sc.close();
//     }
// }


import java.util.Scanner;

class Solution {

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int lastDigit = n % 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
            return 0;
        }

        rev = rev * 10 + lastDigit;
        n = n / 10;
}

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reversed Number: " + reverse(n));

        sc.close();
    }
}