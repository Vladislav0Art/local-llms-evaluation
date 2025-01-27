package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedLocationBasicTest {

    @Test
    public void locationBasicTest() {
        Document document = new Document("http://example.com");
        org.junit.Assert.assertEquals("http://example.com", document.location());
    }

}