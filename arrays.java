

public class arrays {

public static void main(String[] args) {
 
    // String[] animals;


    // animals = new String[5];

    String[] animals = {"Cow", "Cat", "Bird", "dog", "fish"};

    animals[0] = "cow";
    animals[1] = "Cat";
    animals[2] = "Bird";
    animals[3] = "dog";
    animals[4] = "fish";

    for ( int i = 0; i < animals.length; i += 1) {
        System.out.println(
            String.format("The animals names are %s", animals[i])
        );
    }

    System.out.println("---------------------------------------");

    for (String name : animals) {
        System.out.println(
            String.format("I am not sure what this is going to do %s", name)
        );
    }

    System.out.println("---------------------------------------");

    








}}