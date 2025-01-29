package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestJoinPaths5 {

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
    public void testJoinPaths5() {
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("name", 1);
        assert joinPaths(map3.keySet().toArray(new String[0]), map3.values().stream().map(Object::toString).collect(Collectors.toList())) == "name=1";
    }

}