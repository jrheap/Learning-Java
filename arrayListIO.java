import java.util.ArrayList;

public class arrayListIO {

    public static void main(String[] args) {

        ArrayList<String> nbateams = new ArrayList<>();

        nbateams.add("Jazz");
        nbateams.add("Lakers");
        nbateams.add("Heat");
        nbateams.add("Bucks");
        nbateams.add("Clippers");

        System.out.println("-------------------------------------------");

        System.out.println(
            String.format("The first NBA team is %s", nbateams.get((0))));

        System.out.println("-------------------------------------------");

        System.out.println(nbateams);

        System.out.println("-------------------------------------------");

        nbateams.remove(0);

        System.out.println("-------------------------------------------");

        System.out.println(
                String.format("Now that one index has been removed, the first index is now %s ", nbateams.get(0)));
        System.out.println(nbateams);


        System.out.println("-------------------------------------------");

        nbateams.set(0, "Jazz");

        System.out.println(
            String.format("After using .set the %s will be added back added back to the array", nbateams.get(0))
        );

        System.out.println("-------------------------------------------");

        nbateams.set(3, "TimberWolves");

        System.out.println(
            String.format("I am testing if .set with let you add to the array %s", nbateams.get(3))
        );

        System.out.println("-------------------------------------------");

        // .set will delete the index that you are trying to reset 
        System.out.println(nbateams);

        System.out.println("-------------------------------------------");

        for (String nbaString : nbateams) {
            System.out.println(String.format("What the heck does this do %s", nbateams));
        }
    }
}