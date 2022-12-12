import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Please enter your name");
         student.setName(myinput.nextLine());
        System.out.println("Please enter your address");
        student.setAddress(myinput.nextLine());
        System.out.println("Please enter your id");
        student.setIdnumber(myinput.nextInt());
        System.out.println("Please enter your age");
        student.setAge(myinput.nextInt());

        System.out.println(student);


        System.out.println("Please enter a filename");
        String filename = myinput.next();


        try {
            Scanner file = new Scanner(new File(filename));
            FileWriter fileWriter = new FileWriter(filename,true);
            fileWriter.write(student.getName());
            fileWriter.write(student.getAge());
            fileWriter.write(student.getIdnumber());
            fileWriter.write(student.getAddress());
             file.close();

            System.out.println("Your details have been saved ");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
