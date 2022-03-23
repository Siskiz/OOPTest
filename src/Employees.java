import java.util.ArrayList;

public class Employees {

    private static ArrayList<Employee> employeesArrayList = new ArrayList<>();
    public static int countEmployee;

    public static void addEmployee(Employee employee) {
        employeesArrayList.add(employee);
        countEmployee++;
    }

    public static ArrayList<Employee> getEmployeesList() {
        return employeesArrayList;
    }

    public static void removeEmployee(Employee employee) {
        if (!employeesArrayList.contains(employee)) {
            System.out.println("This employee don't work here");
            return;
        }
        employeesArrayList.remove(employee);
    }

    public static void getInformationAllEmployees(ArrayList<Employee> employeesArrayList) {
        for (Employee employee : employeesArrayList) {
            Employee.getInformation(employee);
            System.out.println();
        }
    }


}
