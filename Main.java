import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            CreateNewFile createNewFile = new CreateNewFile();
            String userInputPathName = null;



            System.out.println("Do you want create new file (y/n)?\n");
            String answer = sc.nextLine();

            switch (answer) {
                case "y":
                case "Y":
                    createNewFile.createNewFile();
//                    FileName fileName = new FileName();
                    Menu.menu();



                    /* SIIN OLEN POOLELI */
                    //vaja saada selliselt, et siin valitud faili nimi l'heks k6igile



                case "n":
                case "N":
                    FileChoose.fileChoose();
                default:
                    createNewFile.createNewFile();
            }
        }
    }


