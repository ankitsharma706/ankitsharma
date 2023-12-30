import java.util.HashMap;
import java.util.Map;

public class prac06 {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);
        System.out.println(m);
        System.out.println(m.size());

        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue()); // Fixed typo here (e.getvalue() to e.getValue())
        }
        if (m.containsKey("ide")) {
          System.out.println("yes");
        }else{
          System.out.println("No");
        }m.remove("ide");
        System.out.println(m.size());
        if (m.containsValue(15)) {
          System.out.println("yes");
        }
      }else{
        System.out.println("No");
      }
    }
}
