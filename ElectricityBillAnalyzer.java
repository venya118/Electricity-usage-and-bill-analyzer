import java.util.ArrayList;
import java.util.Scanner;

public class ElectricityAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Appliance> appliances = new ArrayList<>();

        System.out.print("Enter number of appliances: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for appliance " + (i + 1));

            System.out.print("Appliance Name: ");
            String name = sc.nextLine();

            System.out.print("Power Rating (W): ");
            double watt = sc.nextDouble();

            System.out.print("Hours Used Per Day: ");
            double hours = sc.nextDouble();

            System.out.print("Days Used Per Month: ");
            int days = sc.nextInt();
            sc.nextLine();

            appliances.add(new Appliance(name, watt, hours, days));
        }

        double totalUnits = 0;
        Appliance highest = appliances.get(0);

        System.out.println("\n--- Appliance Usage Report ---");
        for (Appliance a : appliances) {
            double units = a.calculateUnits();
            totalUnits += units;
            System.out.println(a.name + " -> " + units + " units");

            if (a.calculateUnits() > highest.calculateUnits()) {
                highest = a;
            }
        }

        double bill = BillCalculator.calculateBill(totalUnits);

        System.out.println("\nTotal Units Consumed: " + totalUnits);
        System.out.println("Estimated Electricity Bill: ₹" + bill);
        System.out.println("Highest Consuming Appliance: " + highest.name);

        System.out.println("\n--- Suggestions ---");
        if (highest.name.equalsIgnoreCase("AC")) {
            System.out.println("Try reducing AC usage or use energy-saving mode.");
        } else {
            System.out.println("Reduce usage of " + highest.name + " to save electricity.");
        }

        sc.close();
    }
}
