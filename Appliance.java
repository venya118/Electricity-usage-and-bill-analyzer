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

