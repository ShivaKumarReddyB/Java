package vehicleCart;
import java.util.Scanner;


public class VehicleCartDiver {
    public static void main(String[] args) {

        Scanner scanobj = new Scanner(System.in);

        // Prompt and read values for vehicleName, Price, and tax percentage
        System.out.print("Enter vehicle name: ");
        String vehicleName = scanobj.nextLine();

        System.out.print("Enter Price: $");
        int Price = scanobj.nextInt();

        System.out.print("Enter tax percentage: ");
        double taxPercentage = scanobj.nextDouble();

        // Create a new VehicleCart object named vehicle1
        VehicleCart vehicle1 = new VehicleCart(vehicleName, Price, taxPercentage);

        // Print vehicle1 using the toString() method
        System.out.println(vehicle1);

        // Print total price and final price with appropriate labels
        System.out.println("Total Price: $" + vehicle1.calcTotalPrice());
        System.out.println("Final Price: $" + vehicle1.calcFinalPrice());

        // Create a new VehicleCart object named vehicle2 using the no-argument constructor
        VehicleCart vehicle2 = new VehicleCart();

        // Print vehicle2 using the toString() method
        System.out.println("\n" + vehicle2);

        // Print total price and final price with appropriate labels for vehicle2
        System.out.println("Total Price for vehicle2: $" + vehicle2.calcTotalPrice());
        System.out.println("Final Price for vehicle2: $" + vehicle2.calcFinalPrice());

        // Use setter methods to set values for vehicleName, Price, and tax percentage for vehicle2
        vehicle2.setVehicleName("Chevrolet");
        vehicle2.setPrice(30000);
        vehicle2.setTaxPercentage(12.50);

        // Print vehicle2 with updated values
        System.out.println("\n" + vehicle2);

        // Print total price and final price with appropriate labels for vehicle2 after updates
        System.out.println("Total Price for vehicle2 after updates: $" + vehicle2.calcTotalPrice());
        System.out.println("Final Price for vehicle2 after updates: $" + vehicle2.calcFinalPrice());

        // Observing the behavior of the no-argument constructor
        System.out.println("\nObservation: The no-argument constructor does not initialize any values, so the instance variables of vehicle2 remain at their default values.");

        VehicleCart vehicle3 = new VehicleCart("Car", 13000, 12.9);
        System.out.println(vehicle3);

    }
}
