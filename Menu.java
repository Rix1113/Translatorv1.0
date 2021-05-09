import java.io.IOException;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);
    static GetAll oW = new GetAll();
    static GetOne gA = new GetOne();


    //Põhimenüü
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

        switch (ans) {
            case "1":
                Mapping.mapping();
                break;
            case "2":
                gA.getOne();
                break;
            case "3":
                oW.getAllWords();
                break;
            case "4":
                System.out.println("Closing program");
                System.exit(0);
            default:
                menu();
                break;
        }
    }
}
