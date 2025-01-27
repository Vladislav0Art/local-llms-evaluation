package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendString {

    @Test
    public void testAppendString() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);

        Element paragraph = document.select("body").first();
        paragraph.append(" Added string");

        System.out.println(paragraph.toString());
    }

}