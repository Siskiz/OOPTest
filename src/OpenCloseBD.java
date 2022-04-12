import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public interface OpenCloseBD {

    Path bd = Path.of("C:\\OOPTest\\bd.txt");
    Path copyBD = Path.of("C:\\OOPTest\\buffer.txt");

    /*
    This I will want to create function. It starts work, copy file in buffer
     */
    static List<Employee> startWork(List<Employee> employeeList) throws IOException, InterruptedException {
        //Start function message
        LocalDateTime time = LocalDateTime.now();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeWithFormat = format.format(time);
        System.out.println("Time start work - " + timeWithFormat);

        System.out.println("Copy file in buffer");
        Files.copy(bd, copyBD);
        // Countdown
        for (int i = 3; i >= 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Done");
        }

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
            System.out.println("Done");
        }
        return null;
    }

    /*
    This I would like to end work and alter information in bd new information from buffer
     */
    static void endWork(ArrayList<Employee> employees) throws InterruptedException, IOException {
        //Start function message
        LocalDateTime time = LocalDateTime.now();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeWithFormat = format.format(time);
        System.out.println("Time end work - " + timeWithFormat);

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
            System.out.println("Done");
        }
    }

}
