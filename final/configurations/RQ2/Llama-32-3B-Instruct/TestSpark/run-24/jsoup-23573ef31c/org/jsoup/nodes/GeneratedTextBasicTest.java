package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTextBasicTest {

    @Test
    public void textBasicTest() {
        Document document = new Document("http://example.com");
        String text = document.text("Test Text");
        org.junit.Assert.assertEquals("Test Text", text);
    }

}