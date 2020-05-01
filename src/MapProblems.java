import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));

        }
        map.remove("c");
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && (map.containsKey("b"))) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") & !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") & !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        String strA = "";
        String strB = "";
        if (map.containsKey("a") & map.containsKey("b")) {
            strA = map.get("a");
            strB = map.get("b");
            if (strA.length() > strB.length()) {
                map.put("c", map.get("a"));
            } else if (strA.length() < strB.length()) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
