package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedBodyBasicTest {

    @Test
    public void bodyBasicTest() {
        Document document = new Document("http://example.com");
        Element bodyElement = document.body();
        org.junit.Assert.assertNotNull(bodyElement);
    }

}