package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestEncodePath {

    private static String getAnchorUrl(String url, int anchorIndex) {
        return url.replace("#anchor", "") + "#" + anchorIndex;
    }

    @Test
    public void testEncodePath() {
        String path = "/path with%, and";
        Document doc = Jsoup.parse(path);
        System.out.println(doc.select("a").first().attr("href"));
        assertEquals("/path%2C%20and", encodePath(path));
    }

}