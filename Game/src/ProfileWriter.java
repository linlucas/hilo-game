import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProfileWriter {
    private Map<String, Integer> profilesMap = new HashMap<>();
    private File profilesFile;

    public ProfileWriter(String user, Integer score) {
        profilesMap.put(user, score);
    }

    public void makeFile() {
        profilesFile = new File("userProfiles.txt");
        boolean fileMade = true;
        try {
            if (!profilesFile.exists()) {
                fileMade = profilesFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("File could not be made");
            e.printStackTrace();
        }
        if (fileMade) {
            System.out.println("Created new userProfiles file.");
        }
    }

    public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(profilesFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(profilesMap.toString());
        } catch (IOException e) {
            System.out.println("Could not write the profiles.");
            e.printStackTrace();
        }
    }


}
