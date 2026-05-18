import java.util.*;

public class elderorchilder{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String setTokenName = "elder";
        String setPassword = "12345";

        System.out.print("Enter token name (elder or children): ");
        String name = input.nextLine();

        if (name.equals(setTokenName)) {

            System.out.println("You get the tickets");

            System.out.print("Enter your trip price: ");
            int price = input.nextInt();

            if (price > 0) {

                input.nextLine(); // clear buffer

                System.out.println("Price Accepted");

                int chance = 3;

                while (chance > 0) {

                    System.out.print("Enter your password: ");
                    String password = input.nextLine();

                    if (password.equals(setPassword)) {

                        System.out.println("Congratulations! Your booking is successful");
                        break;

                    } else {

                        chance--;

                        if (chance == 3) {
                            System.out.println("Wrong password! You have 3 chances left.");
                        }
                        else if (chance ==2 ) {
                            System.out.println("Wrong password! You have 2 chances left");
                        }
                        else if (chance == 1) {
                            System.out.println("Wrong password! This is your last chance.");
                        }

                        else {
                            System.out.println(" Srrory  Wrong password! Please login again.");
                        }
                    }
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