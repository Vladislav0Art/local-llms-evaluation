package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestJoinPaths2 {

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
    public void testJoinPaths2() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        System.out.println(joinPaths(doc.body().text(), Collections.singletonList(null)));
    }

}