import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ProfileReader {
    private Map<String, Integer> profilesMap;
    private StringBuilder userData;

    public ProfileReader() {
        profilesMap = new HashMap<>();
        userData = new StringBuilder();
        readFile();
    }

    public void readFile() {
        try {
            File profilesFile = new File("userProfiles.txt");
            FileReader fileReader = new FileReader(profilesFile);
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
        }
    }

    public void putDataIntoMap() {
        String data = userData.toString();
        data = data.substring(1, data.length() - 1);
        String[] users = data.split(" ");

        for (String user : users) {
            int equalsLoc = user.indexOf("=");
            profilesMap.put(user.substring(0, equalsLoc),
                    Integer.parseInt(user.substring(equalsLoc + 1, user.length() - 1)));
        }
    }
}
