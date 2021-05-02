import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class GetOne {
    public void getOne() throws IOException {

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        //Faili asukoht
        String filePath = "Text.txt";
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
        //Toob yksikult k6ik v4lja
        System.out.print("\nEnter English word: ");
        String key = scanner.nextLine();
            System.out.println(key + " - " + map.get(key));
        reader.close();

        //j4tkamiseks vajalik valik
        System.out.println("\nAre you want continue (y/n)?");
        String answer = scanner.nextLine();

        switch (answer) {
            case "y":
            case "Y":
                getOne();
            case "n":
            case "N":
                menu.menu();
        }
        }

    }
