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
}
