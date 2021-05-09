import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            CreateNewFile createNewFile = new CreateNewFile();

            System.out.println("Do you want create new file (y/n)?\n");
            String answer = sc.nextLine();

            switch (answer) {
                case "y":
                case "Y":
                    createNewFile.createNewFile();
                    Menu.menu();
                case "n":
                case "N":
                    FileChoose.fileChoose();
                default:
                    createNewFile.createNewFile();
            }
        }
    }


