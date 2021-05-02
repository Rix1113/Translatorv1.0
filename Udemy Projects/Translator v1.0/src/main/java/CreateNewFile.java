import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {


    public void createNewFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        //Siin on faili asukoht

        File file = new File("Text.txt");
        boolean result;

        try {
            result = file.createNewFile();
            if (result) {
                System.out.println("file created " + file.getCanonicalPath());
            } else {
                System.out.println("File already exist at location: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            System.out.println("CreateNewFile file creator ERROR");
        }
        System.out.println("Do you want continue (y/n)?");
        String answer = scanner.nextLine();

        //j4tkamiseks vajalik valik
        switch (answer) {
            case "y":
            case "Y":
                menu.menu();

            case "n":
            case "N":
                menu.newFile();

        }
    }
}

