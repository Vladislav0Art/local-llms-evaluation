package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest_getWholeText {

    public static String getWholeText(String html) {
        Document doc = Jsoup.parse(html);
        return doc.body().text();
    }

    public static boolean isBlank(String html) {
        return getWholeText(html).trim().isEmpty();
    }

    @Test
    public void test_getWholeText() {
        String html = "<p>This is a <span>test</span> paragraph.</p>";
        System.out.println(Main.getWholeText(html));
    }

}