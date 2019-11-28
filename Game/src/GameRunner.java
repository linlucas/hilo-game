public class GameRunner {
    public static void main(String[] args) {
        ProfileWriter writer = new ProfileWriter();
        ProfileReader reader = new ProfileReader();
        writer.writeToMap("lucas", 23);
        writer.writeToMap("dion", 14);
        writer.writeToMap("yegan", 13);
        reader.putDataIntoMap();
        System.out.println(reader.getProfilesMap().toString());
    }
}
