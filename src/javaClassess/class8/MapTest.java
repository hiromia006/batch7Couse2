package javaClassess.class8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "wasid");
        map.put("number", 85);
        map.put("point", 3.98);
//        System.out.println(map);

        System.out.println(map.get("point"));
        map.put("salary", 65844);


        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "wasid");
        map2.put("number", 85);
        map2.put("point", 3.98);

        map.put("map2", map2);

        System.out.println(map);

    }
}
