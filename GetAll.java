import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class GetAll {

    public void getAllWords(String name) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();


        //Siin on faili asukoht
        String filePath = FileName.getUserInputFileName();
        HashMap<String, String> map = new HashMap<>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" - ", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }

        //Loop selle jaoks, et tooks k6ik failis olevad kirjed v4lja
        System.out.println();
        for (String key : map.keySet()) {
            System.out.println("" + key + " - " + map.get(key));
        }
        reader.close();

// j4tkamiseks vajalik tegevus
        System.out.println("\nReturn main menu (press any key)");
        String answer = scanner.nextLine();

        switch (answer) {
            default:
                menu.menu();
        }
    }


}