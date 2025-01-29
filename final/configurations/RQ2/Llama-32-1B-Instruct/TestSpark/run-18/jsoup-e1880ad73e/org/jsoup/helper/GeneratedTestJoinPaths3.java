package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestJoinPaths3 {

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
    public void testJoinPaths3() {
        Map<String, String> map = new HashMap<>();
        map.put("x", "1");
        assert joinPaths(map.keySet().toArray(new String[0]), map.values().stream().map(String::valueOf).collect(Collectors.toList())) == "x=1";
    }

}