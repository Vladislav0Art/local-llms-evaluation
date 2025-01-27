package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendCharacter {

    @Test
    public void testAppendCharacter() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);

        Element paragraph = document.select("body").first();
        paragraph.append("\u0001");

        System.out.println(paragraph.toString());
    }

}