public class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double rateIn) {
        hourlyRate = rateIn;
    }
    public double findPaymentAmount (int hours) {
        return hourlyRate * hours;
    }
}
