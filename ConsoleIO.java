// package console;

import java.util.Scanner;

public class ConsoleIO{

public static void main(String[] aStrings) {

// What does this do? 
Scanner input = new Scanner(System.in);

System.out.println("Please, enter the students first name.");
String firstName = input.next();

System.out.println("Please, enter the students Middle name");
String middleName = input.next();

System.out.println("Please, enter the students last name.");
String lastName = input.next();

System.out.println("Please, enter the students address");
String address = input.next();

System.out.println("Please, enter the students phone number");
String phoneNum = input.next();

System.out.println("Please, enter the students email");
String email = input.next();

// ======================================================= //

System.out.println(
    String.format("The student's first name is %s", firstName)
);

System.out.println("-----");

System.out.println(
    String.format("The student's middle name is %s", middleName)
);

System.out.println("-----");

System.out.println(
    String.format("The student's last name %s", lastName)
);

System.out.println("-----");

System.out.println(
    String.format("The student's address is %s", address)
);

System.out.println("-----");

System.out.println(
    String.format("The student's phone number is %s", phoneNum)
);

System.out.println("-----");

System.out.println(
    String.format("The student's email is %s", email)
);

System.out.println("-----");

System.out.println("Is this information complete? ");
    String comfirmation = input.next();


}


}