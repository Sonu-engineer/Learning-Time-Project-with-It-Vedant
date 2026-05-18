//public class booking{
//    public  static  void main(String[] args){
//        String settoken ="32334";
//        String settokename[]="elder","teacher","children";
//        String setpassword="1234";
//        System.out.println("Ente who taken name like elder or teacher and chider:");
//        String name=input.nextLine();
//        if(name.equals(setTokenName)){
//            System.out.println("you get the tickets");
//            System.out.println("Enter your trip price:");
//            int price = intput.nextInt();
//            if(price > 0){
//                input.nextLine();
//                System.out.println("Price Accepted");
//                System.out.println("Enter your password");
//                String password=input.nextLine();
//                if(password.equals(setPassword)){
//                    System.out.println("Congratulations! you bookig is successful");
//                }else{
//                    System.out.println("Wrong passwod");
//                }else{
//                    System.out.println("Inviad price");
//                }else{
//                    System.out.println("Invaild token name");
//                }
//                input.close();
//            }
//        }
//    }
//}
import java.util.Scanner;

public class booking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String setToken = "32334";

        String[] setTokenName = {"1.elder", "2.teacher", "3.children"};

        String setPassword = "1234";

        System.out.println("Enter who taken name like elder or teacher or children:");
        String name = input.nextLine();

        // Check valid token names
        if (name.equals(setTokenName[0]) ||
                name.equals(setTokenName[1]) ||
                name.equals(setTokenName[2])) {

            System.out.println("You get the tickets");

            System.out.println("Enter your trip price:");
            int price = input.nextInt();

            if (price > 0) {

                input.nextLine(); // clear buffer

                System.out.println("Price Accepted");

                System.out.println("Enter your password:");
                String password = input.nextLine();

                if (password.equals(setPassword)) {

                    System.out.println("Congratulations! Your booking is successful");

                } else {

                    System.out.println("Wrong password");
                }

            } else {

                System.out.println("Invalid price");
            }

        } else {

            System.out.println("Invalid token name");
        }

        input.close();
    }
}