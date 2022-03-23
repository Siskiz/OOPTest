public class Test {

    public static void main(String[] args) {

        Employee Egor = new Employee(Specialization.ENGINEER, FamilyStatus.MARRIED, "junior", 10, 0);
        Employee Nastasia = new Employee(Specialization.ENGINEER, FamilyStatus.NOT_MARRIED, "lead", 30, 5);
        Employee Aliaksei = new Employee(Specialization.MANAGER, FamilyStatus.NOT_MARRIED, "lead", 28, 6);
        Employee Nikita = new Employee(Specialization.MANAGER, FamilyStatus.MARRIED, "middle", 24, 3);
        Employee Slava = new Employee(Specialization.ENGINEER, FamilyStatus.NOT_MARRIED, "junior", 22, 1);

        Employees.addEmployee(Egor);
        Employees.addEmployee(Nastasia);
        Employees.addEmployee(Aliaksei);
        Employees.addEmployee(Nikita);
        Employees.addEmployee(Slava);

        Employees.getInformationAllEmployees(Employees.getEmployeesList());

        Employees.removeEmployee(Egor);
        Employees.removeEmployee(Slava);

        System.out.println(Nastasia.getAge());
        System.out.println(Aliaksei.getFamilyStatus());

        Employees.getInformationAllEmployees(Employees.getEmployeesList());

    }

}
