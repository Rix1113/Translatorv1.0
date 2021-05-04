import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public void createNewFile() throws IOException {

        //Siin on faili asukoht
        FileName fileName = new FileName();
        File file = new File(FileName.getUserInputFileName());
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
        Menu.menu();
    }
}

