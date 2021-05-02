import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            CreateNewFile createNewFile = new CreateNewFile();
            Menu menu = new Menu();
            String userInputPathName = null;



            System.out.println("Do you want create new file (y/n)?\n");
            String answer = sc.nextLine();

            switch (answer) {
                case "y":
                case "Y":
                    System.out.println("Choose file name (Filename.txt)");
                    userInputPathName = sc.nextLine();
                    FilePath filePath = new FilePath(userInputPathName);
                    filePath.getUserInputPathName();

                    createNewFile.createNewFile(userInputPathName);

                case "n":
                case "N":
                    FileChoose.fileChoose();
                default:
                    createNewFile.createNewFile(userInputPathName);
            }
        }
    }


