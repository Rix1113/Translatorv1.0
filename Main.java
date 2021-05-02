import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            CreateNewFile createNewFile = new CreateNewFile();
            Menu menu = new Menu();


            System.out.println("Do you want create new file (y/n)?\n");
            String answer = sc.nextLine();

            switch (answer) {
                case "y":
                case "Y":

                    createNewFile.createNewFile();

                case "n":
                case "N":
                    menu.menu();
                default:
                    createNewFile.createNewFile();
            }
        }
    }


