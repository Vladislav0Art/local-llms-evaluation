package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestJsoupParseString {

    @Test
    public void testJsoupParseString() {
        String html = "<p>Hello World!</p>";
        Document document = Jsoup.parse(html);
        System.out.println(document.toString());
    }

}