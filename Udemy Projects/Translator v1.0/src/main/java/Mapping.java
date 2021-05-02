import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Mapping {
    static String outputFilePath = "Text.txt";

    public static void mapping() throws IOException {

        HashMap<String, String> translatorMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

//        Menu menu = new Menu();

        do {
            System.out.println("Enter the English word: ");
            String eng = scanner.nextLine();

            System.out.println("Enter the Estonian translation: ");
            String est = scanner.nextLine();


            String oldVal = translatorMap.put(eng, est);


            File file = new File(outputFilePath);

            BufferedWriter bf = null;

            if (oldVal != null) {
                System.out.println("Word in english: " + eng + " is "
                        + oldVal + " and has been overwritten by " + est);
            }
                try {
                    bf = new BufferedWriter(new FileWriter(file, true));
                    for (Map.Entry<String, String> entry : translatorMap.entrySet()) {
                        bf.write(entry.getKey() + " - " + entry.getValue());
                        bf.newLine();
                    }
                    bf.flush();
                } catch (IOException e) {
                    System.out.println("BufferWriter block ERROR");
                } finally {
                    try {
                        assert bf != null;
                        bf.close();
                    } catch (Exception e) {
                        System.out.println("BufferWriter is not CLOSED");
                    }
                }

                System.out.println("Enter another translation (y/n)?");
                String answer = scanner.nextLine();

                switch (answer) {
                    case "y":
                    case "Y":
                        continue;
                    case "n":
                    case "N":
                        Menu.menu();
                    default:
                        Menu.menu();
                }


        }while (true) ;
    }
}