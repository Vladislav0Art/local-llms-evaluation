package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedTestDocument {

    @Test
    public void testDocument() {
        String htmlString = "<html><head><title>My Title</title></head><body>Hello World!</body></html>";
        Document document = Jsoup.parse(htmlString);
        Element titleElement = document.selectFirst("title");
        System.out.println(titleElement.text());
    }

}