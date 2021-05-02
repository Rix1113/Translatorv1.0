import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public void createNewFile(String name) throws IOException {
        Menu menu = new Menu();

        //Siin on faili asukoht

        File file = new File(name);
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
        menu.menu();
    }
}

