import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;
    }
//                ENALLAKTIKA
//    public Map<String, Integer> word0(String[] strings) {
//        Map<String, Integer> map = new HashMap();
//        for (String s:strings) {
//            map.put(s, 0);
//        }
//        return map;
//    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }
        return map;
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(0, 1), strings[i].substring(strings[i].length() - 1));
        }
        return map;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                int count = map.get(strings[i]);
                map.put(strings[i], count + 1);
            } else if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
            }
        }
        return map;
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].substring(0, 1))) {
                String previous = map.get(strings[i].substring(0, 1));
                map.put(strings[i].substring(0, 1), previous + strings[i]);
            } else {
                map.put(strings[i].substring(0, 1), strings[i]);
            }
        }
        return map;
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                int count = map.get(strings[i]);
                map.put(strings[i], count + 1);
                if (map.get(strings[i]) % 2 == 0) {
                    result += strings[i];
                }
            } else if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
            }
        }
        return result;
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], true);
            } else if (!map.containsKey(strings[i])) {
                map.put(strings[i], false);
            }
        }
        return map;
    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String[] result = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].substring(0, 1))) {
                int index = map.get(strings[i].substring(0, 1));
                result[index] = strings[i];
                result[i] = strings[index];
                map.remove(strings[i].substring(0, 1));
            } else if (!map.containsKey(strings[i].substring(0, 1))) {
                map.put(strings[i].substring(0, 1), i);
                result[i] = strings[i];
            }
        }
        return result;
    }

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String[] result = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].substring(0, 1))) {
                int index = map.get(strings[i].substring(0, 1));
                result[index] = strings[i];
                result[i] = strings[index];
                map.remove(strings[i].substring(0, 1));

            } else if (!map.containsKey(strings[i].substring(0, 1))) {
                map.put(strings[i].substring(0, 1), i);
                result[i] = strings[i];
            }
        }
        return result;
    }


}
