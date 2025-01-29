package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestJoinPaths6 {

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
    public void testJoinPaths6() {
        Map<String, String> map4 = new HashMap<>();
        map4.put("key", null);
        assert joinPaths(map4.keySet().toArray(new String[0]), map4.values().stream().map(String::valueOf).collect(Collectors.toList())) == "key=null";
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