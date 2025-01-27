package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedTestJsoup {

    @Test
    public void testJsoup() throws IOException {
        String htmlString = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(htmlString);
        System.out.println(document.title());
        System.out.println(document.body().text());
    }

}