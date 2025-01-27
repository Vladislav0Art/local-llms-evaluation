package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedHeadBasicTest {

    @Test
    public void headBasicTest() {
        Document document = new Document("http://example.com");
        Element headElement = document.head();
        org.junit.Assert.assertNotNull(headElement);
    }

}