public class FullTimeEmployee extends Employee{
    private double weeklySalary;
    private double benefitDeduction;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public void setBenefitDeduction(double benefitDeduction) {
        this.benefitDeduction = benefitDeduction;
    }
    public double getBenefitDeduction() {
        return benefitDeduction;
    }
    public double findPayementAmount() {
        return weeklySalary - benefitDeduction;
    }
}
