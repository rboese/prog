package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {
    public static void main(String args[]) {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("Mary", "123-4567");
        hm.put("Larry", "234-5678");
        hm.put("Mary", "456-7890");
        hm.put("Felicia", "345-6789");

        Iterator<Map.Entry<String, String>> iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> e = iter.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

