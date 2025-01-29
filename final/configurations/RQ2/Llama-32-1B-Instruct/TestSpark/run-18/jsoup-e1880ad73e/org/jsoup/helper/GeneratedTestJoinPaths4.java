package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestJoinPaths4 {

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
    public void testJoinPaths4() {
        Map<String, Object> map2 = new HashMap<>();
        map2.put("key", "value");
        assert joinPaths(map2.keySet().toArray(new String[0]), map2.values().stream().map(Object::toString).collect(Collectors.toList())) == "key=value";
    }

}