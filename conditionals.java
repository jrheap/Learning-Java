import java.text.NumberFormat.Style;
import java.util.Scanner;

public class conditionals {
public static void main(String[] args) {
    
if (4<2){
    System.out.println("I really hope this line doesnt print");
} else if (Math.random() * 10 > 20){
    System.out.println("Hmmmm i dont know maybe....");
}else { 
 System.out.println("At least this will print something");
}

if (4<2){
    System.out.println("I really hope this doesnt print anything");
} else if (Math.random() * 10 < 20) {
    System.out.println("Hmmmm i dont know maybe");
} else {
    System.out.println("Well amybe this one");

}

Scanner input = new Scanner(System.in);

String sentence = "", word = "";
int _int = 0;
double dub = 0;


System.out.println("Write me a sentence");
if (input.hasNextLine()){
    sentence = input.nextLine();
}

System.out.println("Write me a word");
if (input.hasNext()){
    word = input.next();
}

System.out.println("Write me a number");
if (input.hasNextInt()){
    _int = input.nextInt();
} else {
    input.next();
}

System.out.print("Write me a double");
if (input.hasNextDouble()){
    dub = input.nextDouble();
}
 System.out.println("-------------------------------");

 System.out.println(String.format("Your sentence was %s", sentence));
 System.out.println(String.format("Your word was %s", word));
 System.out.println(String.format("Your number was %s", _int));
 System.out.println(String.format("Your double was %s", dub));

}
}    
