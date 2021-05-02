import java.io.IOException;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    static GetAll oW = new GetAll();
    static GetOne gA = new GetOne();
    static CreateNewFile cF = new CreateNewFile();

    //Siin on eelvalik, kas tahad uut faili teha v6i mitte
    public static void newFile() throws IOException {
        System.out.println("Do you want create new file (y/n)?\n");
        String answer = sc.nextLine();

        switch (answer) {
            case "y":
            case "Y":

                cF.createNewFile();
                menu();

            case "n":
            case "N":
                menu();

        }
    }


    //P6himenyy
    public static void menu() throws IOException {

        System.out.println("\n***************************" +
                "\n\tPlease choose 1 - 4\n" +
                "***************************");
        System.out.println();

        System.out.println("1 -- Insert new translation \n" +
                "2 -- Translate word\n" +
                "3 -- Get all words\n" +
                "4 -- Create new file\n" +
                "5 -- Quit");

        String ans = sc.nextLine();


        if (ans.equals("1")) {
            Mapping.mapping();
        } else if (ans.equals("2")) {
            gA.getOne();
        } else if (ans.equals("3")) {
            oW.oneWord();
        } else if (ans.equals("4")) {
            newFile();
        } else if (ans.equals("5")) {
            System.out.println("Closing program");
            System.exit(0);
        } else {
            menu();
        }
    }
}
