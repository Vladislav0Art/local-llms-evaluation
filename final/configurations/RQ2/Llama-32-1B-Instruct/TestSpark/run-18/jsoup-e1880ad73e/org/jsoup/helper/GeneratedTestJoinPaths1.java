package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestJoinPaths1 {

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
    public void testJoinPaths1() {
        assert joinPaths("a", new Object[]{"b", "c"}) == "a/b/c";
    }

}