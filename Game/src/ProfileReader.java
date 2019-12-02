import java.io.*;
import java.util.*;

/**
 * This class reads from userProfile.txt and parses the data in it to a TreeMap.
 *
 * @author Lucas Lin
 * @version Dec 1, 2019
 */
class ProfileReader {
    private Map<String, Integer> profilesMap;
    private StringBuilder userData;

    ProfileReader() {
        profilesMap = new HashMap<>();
        userData = new StringBuilder();
        readFile();
    }

    TreeMap<Integer, String> getProfilesMap() {
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : profilesMap.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }
        return sortedMap;
    }

    private void readFile() {
        FileReader fileReader = null;
        try {
            File profilesFile = new File("userProfiles.txt");
            fileReader = new FileReader(profilesFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                userData.append(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("profilesFile does not exist!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File reading failed.");
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void putDataIntoMap() {
        String data = userData.toString();
        data = data.substring(0, data.length() - 1);
        String[] users = data.split("}");

        for (String user : users) {
            int bracesLoc = user.indexOf("{");
            int equalsLoc = user.indexOf("=");
            profilesMap.put(user.substring(bracesLoc + 1, equalsLoc),
                    Integer.parseInt(user.substring(equalsLoc + 1)));
        }
    }
}
