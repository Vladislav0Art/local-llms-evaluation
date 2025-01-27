package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTitleBasicTest {

    @Test
    public void titleBasicTest() {
        Document document = new Document("http://example.com");
        String title = document.title();
        org.junit.Assert.assertEquals("", title);
    }

}