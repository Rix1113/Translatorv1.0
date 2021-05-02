import java.io.IOException;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    static GetAll oW = new GetAll();
    static GetOne gA = new GetOne();
    static Main main = new Main();

    //Siin on eelvalik, kas tahad uut faili teha v6i mitte



    //P6himenyy
    public static void menu() throws IOException {

        System.out.println("\n***************************" +
                "\n\tPlease choose 1 - 4\n" +
                "***************************");
        System.out.println();

        System.out.println("1 -- Insert new translation \n" +
                "2 -- Translate word\n" +
                "3 -- Get all words\n" +
                "4 -- Quit");

        String ans = sc.nextLine();

        if (ans.equals("1")) {
            Mapping.mapping();
        } else if (ans.equals("2")) {
            gA.getOne();
        } else if (ans.equals("3")) {
            oW.oneWord();
        } else if (ans.equals("4")) {
            System.out.println("Closing program");
            System.exit(0);
        } else {
            menu();
        }
    }
}
