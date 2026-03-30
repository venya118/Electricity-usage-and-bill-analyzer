//stores appliance details.
public class Appliance {
    String name;
    double watt;
    double hoursPerDay;
    int days;

    public Appliance(String name, double watt, double hoursPerDay, int days) {
        this.name = name;
        this.watt = watt;
        this.hoursPerDay = hoursPerDay;
        this.days = days;
    }

    public double calculateUnits() {
        return (watt * hoursPerDay * days) / 1000;
    }
}

// Calculates bills based on total units.
public class BillCalculator {
    public static double calculateBill(double units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4) + ((units - 300) * 6);
        }

        return bill;
    }
}
