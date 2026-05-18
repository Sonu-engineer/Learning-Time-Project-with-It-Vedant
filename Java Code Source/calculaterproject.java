//import java.util.*;
//public class calculaterproject {
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//      int a,b,choice;
//        System.out.println("Enter first Number:");
//        a=sc.nextint();
//        System.out.println("1.Addition");
//        System.out.println("2 Subtraction");
//        System.out.println("3 Multiplication");
//        System.out.println("4 Division");
//        System.out.println("5 Modulus");
//        System.out.println("Enter Your Choice");
//        choice= sc.nextInt();
//        switch (choice){
//            case 1:
//            System.out.println("Addition="+(a+b));
//                break;
//            case 2:
//                 System.out.println("Subtraction="-(a-b));
//                 break;
//            case 3:
//                     System.out.println("Muliplication ="+(a*b));
//                   break;
//            case 4:
//                       System.out.println("Division ="+(a/b));
//                       break;
//            case 5:
//                           System.out.println("Moduus ="+(a%b));
//                           break;
//            default:
//                System.out.println("Invalid choice");
//        }
//
//
//
//    }
//}


import java.util.*;

public class CalculatorProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, choice;

        System.out.println("Enter first number:");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();

        System.out.println("1. Addition +");
        System.out.println("2. Subtraction -");
        System.out.println("3. Multiplication *");
        System.out.println("4. Division /");
        System.out.println("5. Modulus %");

        System.out.println("Enter your choice:");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition +  = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction - = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication * = " + (a * b));
                break;

            case 4:
                System.out.println("Division / = " + (a / b));
                break;

            case 5:
                System.out.println("Modulus  %= " + (a % b));
                break;

            default:
                System.out.println("Invalid choice 🙂");
        }

        sc.close();
    }
}