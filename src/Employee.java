import java.util.ArrayList;
import java.util.Objects;

public class Employee {

    private Specialization specialization;
    private FamilyStatus familyStatus;
    private String position;
    private int age;
    private int workExperience;

    /**
     *
     * @param specialization - I think, the best idea create enum
     * @param familyStatus - and here
     */
    public Employee(Specialization specialization, FamilyStatus familyStatus, String position, int age, int workExperience) {
        this.specialization = specialization;
        this.familyStatus = familyStatus;
        this.position = position;
        this.age = age;
        this.workExperience = workExperience;
    }
    public Employee(String[] fieldsEmployee) {
        specialization = Specialization.valueOf(fieldsEmployee[0]);
        familyStatus = FamilyStatus.valueOf(fieldsEmployee[1]);
        position = fieldsEmployee[2];
        age = Integer.parseInt(fieldsEmployee[3]);
        workExperience = Integer.parseInt(fieldsEmployee[4]);

    }

    void setSpecialization (Specialization specialization) {
        this.specialization = specialization;
    }
    public Specialization getSpecialization() {
        return specialization;
    }

    void setFamilyStatus(FamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }
    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

    void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
    public int getWorkExperience() {
        return workExperience;
    }

    public static void getInformation(Employee employee) {
        System.out.print("My specialization - " + employee.getSpecialization() + ". ");
        System.out.print("My familyStatus - " + employee.getFamilyStatus() + ". ");
        System.out.println("My position - " + employee.getPosition());
        System.out.printf("I'm %d age old and my workExperience %d year", employee.getAge(), employee.getWorkExperience());
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && workExperience == employee.workExperience
                && specialization == employee.specialization && familyStatus == employee.familyStatus
                && position.equals(employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialization, familyStatus, position, age, workExperience);
    }

    public static ArrayList<String> changeEmployeeInString(ArrayList<Employee> endList) {
        ArrayList<String> endArrayList = new ArrayList<>();
        for (Employee employee : endList) {
            String fieldsEmployee = "" + employee.specialization + " " + employee.familyStatus
                    + employee.position + employee.age + employee.workExperience;
            endArrayList.add(fieldsEmployee);
        }
        return endArrayList;
    }

}
