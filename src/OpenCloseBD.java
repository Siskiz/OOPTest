import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public interface OpenCloseBD {

    Path bd = Path.of("C:\\OOPTest\\bd.txt");
    Path copyBD = Path.of("C:\\OOPTest\\buffer.txt");

    /*
    This I will want to create function. It starts work, copy file in buffer
     */
    static void startWork(ArrayList<Employee> employeeList) throws IOException, InterruptedException {
        //Start function message
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy HH:mm:ss");
        String time = dtf.format(LocalDateTime.now());
        System.out.println("Time start work - " + time);

        System.out.println("Copy file in buffer");
        Files.copy(bd, copyBD);
        // Countdown
        for (int i = 3; i >= 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Done");

        ArrayList<String> listEmployee = (ArrayList<String>) Files.readAllLines(bd);
        for (String employee : listEmployee) {
            String[] fieldsEmployee = employee.split(" ");
            Employee newEmployee = new Employee(fieldsEmployee);
            employeeList.add(newEmployee);
        }

        Files.delete(bd);

        //Countdown
        System.out.println("Information copy");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Done");
    }

    /*
    This I would like to end work and alter information in bd new information from buffer
     */
    static void endWork(ArrayList<Employee> employees) throws InterruptedException, IOException {
        //Start function message
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy HH:mm:ss");
        String time = dtf.format(LocalDateTime.now());
        System.out.println("Time end work - " + time);

        ArrayList<String> endArrayList = Employee.changeEmployeeInString(employees);
        Files.createFile(bd);
        for (String e : endArrayList) {
            Files.writeString(bd, e);
        }

        //Countdown
        System.out.println("Information copy");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Done");
    }

}
