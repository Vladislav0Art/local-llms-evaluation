package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestGetAnchorUrl {

    private static String getAnchorUrl(String url, int anchorIndex) {
        return url.replace("#anchor", "") + "#" + anchorIndex;
    }

    @Test
    public void testGetAnchorUrl() {
        String url = "https://example.com/path?query=value#anchor";
        Document doc = Jsoup.parse(url);
        System.out.println(doc.select("a").first().attr("href"));
        assertEquals(getAnchorUrl(url, 1), "https://example.com/path#anchor");
    }

}