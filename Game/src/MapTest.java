import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("dion", 12);
        map.put("lucas", 13);
        map.put("lucas", 14);
        System.out.println(map.toString());
    }
}
