public class DoPayRollTypeF {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        ftEmployee.setName("�����");
        ftEmployee.setJobTitle("��������");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPayementAmount());
        System.out.println();

        PartTimeEmployee ptEmployee = new PartTimeEmployee();
        ptEmployee.setName("����");
        ptEmployee.setJobTitle("��������");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(10));
    }
}
