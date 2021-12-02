//
//package com.company;
//
//import com.sun.source.tree.NewArrayTree;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Enter some data");
//        Scanner n = new Scanner(System.in);
//        int n1 = n.nextInt();
//        String answer = "No";
//        while (n1 % 10 > 0) {
//            if (n1 % 10 == ((n1 / 10) % 10)) {
//                answer = "Yes";
//                break;
//            }
//            n1 /= 10;
//        }
//        if (!answer.equals("Yes")) {
//            System.out.println("No");
//        }
//        else{
//            System.out.println("Yes");
//        }
//    }
//}

//package com.company;

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Enter a number: ");
//        Scanner scn = new Scanner(System.in);
//        String scn1 = scn.next();
//
//        int cnt = scn1.length();
//        int[] res = new int[cnt];
//        int temp = Integer.parseInt(scn1);
//        int i = 0;
//        String answer = "";
//        for (i = 0; i <= cnt; i++) {
//            res[i] = temp % 10;
//            if (res[i] == res[i+1]) {
//                answer = "Yes";
//            } else {
//
//                answer = "No";
//
//            }
//        }
//        if (answer == "Yes") {
//            System.out.println(answer);
//        } else {
//            System.out.println("No");
//        }
//
//    }
//}


//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Enter a number: ");
//        Scanner scn1 = new Scanner(System.in);
//        int first = scn1.nextInt();
//        System.out.println("Enter a number: ");
//        int second = scn1.nextInt();
//        int sum = 0;
//        for (first = 0; first <= second; first++) {
//
//            if (first % 2 != 0) {
//                sum += first;
//                System.out.println(sum);
//            }
//        }
//    }
//}
