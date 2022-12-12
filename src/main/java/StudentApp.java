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




    }
}
