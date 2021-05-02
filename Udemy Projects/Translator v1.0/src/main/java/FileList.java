import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileList {

    //Toob v4lja kaustas olevad failid

    List<String> textFiles(String directory) {
        List<String> textFiles = new ArrayList<>();
        File dir = new File(directory);
        for (File file : dir.listFiles()) {
            if (file.getName().endsWith((".txt"))) {
                textFiles.add(file.getName());
            }
        }
        return textFiles;
    }
}