import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class writes the HashMap of user data into userProfiles.txt.
 *
 * @author Lucas Lin
 * @version Dec 1, 2019
 */
class ProfileWriter {
    private Map<String, Integer> profilesMap;
    private File profilesFile;

    ProfileWriter() {
        profilesMap = new HashMap<>();
        makeFile();
    }

    void writeToMap(String user, Integer score) {
        profilesMap.put(user, score);
        writeToFile();
    }

    private void makeFile() {
        profilesFile = new File("userProfiles.txt");
        boolean fileMade = false;
        try {
            if (!profilesFile.exists()) {
                fileMade = profilesFile.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("File could not be made");
            e.printStackTrace();
        }
        if (fileMade) {
            System.out.println("Created new userProfiles file.");
        }
    }

    private void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(profilesFile, true))) {
            writer.write(profilesMap.toString());

        } catch (IOException e) {
            System.err.println("Could not write the profiles.");
            e.printStackTrace();
        }
    }
}