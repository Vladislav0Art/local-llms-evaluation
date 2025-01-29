package org.jsoup.helper;

import java.util.*;

public class GeneratedTestJoinPaths {

    public static String joinPaths(Object... paths) {
        StringBuilder builder = new StringBuilder();
        for (Object path : paths) {
            if (builder.length() > 0) {
                builder.append("/");
            }
            builder.append(path);
        }
        return builder.toString().replaceAll("^/", "");
    }

    @Test
    public void testJoinPaths() {
        assert joinPaths("a", "b") == "a/b";
        assert joinPaths("a", Collections.singletonList("b")) == "a/b";

        List<String> list = Arrays.asList("one", "two");
        assert joinPaths(list) == "/one/two";

        Map<String, String> map = new HashMap<>();
        map.put("x", "1");
        map.put("y", "2");
        assert joinPaths(map.keySet().toArray(new String[0]), map.values().stream().map(String::valueOf).collect(Collectors.toList())) == "x=y";
    }

    public static void main(String[] args) {
        System.out.println(joinPaths("a", new Object[]{true, false})); // prints: "a"

        Map<String, Integer> map = new HashMap<>();
        map.put("name", 1);
        assert joinPaths(map.keySet().toArray(new String[0]), map.values().stream().map(Object::toString).collect(Collectors.toList())) == "name=1";

        Map<String, String> map2 = new HashMap<>();
        map2.put("key", "value");
        assert joinPaths(map2.keySet().toArray(new String[0]), map2.values().stream().map(String::valueOf).collect(Collectors.toList())) == "key=value";
    }

    public static void makeKey(Object... objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }

    public static void makeValue(Object... objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }

}