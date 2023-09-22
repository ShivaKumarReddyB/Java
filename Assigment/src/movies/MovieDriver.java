package movies;

import java.util.Scanner;

public class MovieDriver {
    static Scanner userInput = new Scanner(System.in);
    static boolean exit = false;


    public static String getSeatTypeOfOption(int num) {
        switch (num) {
            case 1:
                return "Top";
            case 2:
                return "Middle";
            case 3:
                return "Lounge";
            case 4:
                return "Bottom";
            default:
                return "";


        }
    }

    public static String getBeverageOfOption(int num) {
        switch (num) {
            case 1:
                return "Pepsi";
            case 2:
                return "Samosa";
            case 3:
                return "Nachos";
            case 4:
                return "Cake";
            case 5:
                return "Water";
            default:
                return "";


        }
    }

    public static void cinemaBooking() {
        System.out.println("********* AMC Cinema Booking Section **********");
        System.out.println("Please Enter the movie which you like to watch");
        String movieName = userInput.next();
        System.out.println(
                "Enter any one of the Seat Types" + "\n" +
                        "1. Top" + "\n" +
                        "2. Middle" + "\n" +
                        "3. Lounge " + "\n" +
                        "4. Bottom " + "\n");

        int seatOption = userInput.nextInt();
        if (seatOption < 5 && seatOption > 0) {
            String seatType = getSeatTypeOfOption(seatOption);
            System.out.println("Enter number of tickets you are required");
            int noOfSeats = userInput.nextInt();
            if (noOfSeats > 5 || noOfSeats <= 0) {
                System.out.println("#ErrorCount Sorry you have exceeded your limit");
                System.out.println("Thank Visit Again....");
                System.out.println("                      ");

            exit = true;
            } else {
                System.out.println("Do you have Membership Pass(True/False):");
                boolean isMember = userInput.nextBoolean();
                boolean isFirstMember = false;
                if (isMember) {
                    System.out.println("Is this your First-time Member(True/False)");
                    isFirstMember = userInput.nextBoolean();
                }
                AmcTheater amcTheater = new AmcTheater(movieName, noOfSeats, seatType, isMember, isFirstMember);
                System.out.println(amcTheater.tktPrint());
            exit = true;
            }
        } else {
            System.out.println("#ErrorCount 01 - Please enter the correct Seat Type");
            System.out.println("Thank Visit Again....");
            System.out.println("                      ");
        }

    }


    public static void beverageSection() {
        System.out.println("********* AMC Cinema Beverage Section **********");
        System.out.println(
                "What would you like to have among these" + "\n" +
                        "1. Pepsi" + "\n" +
                        "2. Samosa" + "\n" +
                        "3. Nachos " + "\n" +
                        "4. Cake " + "\n" +
                        "5. Water ");
        String menuOption = userInput.next();
        System.out.println("Please enter how many quantities your are required");
        int count = userInput.nextInt();
        AmcTheater amcTheater = new AmcTheater(menuOption, count);
        System.out.println(amcTheater.bavTkt(menuOption, count));
        exit= true;


    }

    public static void parkingSection() {
        System.out.println("********* AMC Cinema Parking Section **********");
        System.out.println("Enter your name:");
        String customerName = userInput.next();

        System.out.println(
                "Please enter the vehicle Type" + "\n" +
                        "1. Bicycle" + "\n" +
                        "2. Two-Wheeler" + "\n" +
                        "3. Four-Wheeler " + "\n" +
                        "4. Others " + "\n"
        );
        String vehicleType = userInput.next();
        System.out.println("Enter how many vehicles");
        int vehicleCount = userInput.nextInt();
        AmcTheater amcTheater = new AmcTheater(vehicleCount, customerName, vehicleType);
        System.out.println(amcTheater.parkTkt(vehicleType, vehicleCount));
        exit=true;
    }

    public static void main(String[] args) {

        while (!exit) {
            System.out.println("Welcome to AMC Cinemas Online Booking System " + "\n" +
                    "Please enter what type of booking section you are looking from the following" + "\n" +
                    "1. Cinema Booking" + "\n" +
                    "2. Beverage Section" + "\n" +
                    "3. Parking  Section " + "\n" +
                    "4. Exit" + "\n");

            int mainMenuOption = userInput.nextInt();
            userInput.nextLine();
            switch (mainMenuOption) {
                case 1:
                    cinemaBooking();
                    break;
                case 2:
                    beverageSection();
                    break;
                case 3:
                    parkingSection();
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    exit = true;

                    break;
            }
        }
        userInput.close();

    }


}

