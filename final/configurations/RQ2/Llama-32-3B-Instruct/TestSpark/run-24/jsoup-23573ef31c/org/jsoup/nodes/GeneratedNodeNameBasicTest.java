package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedNodeNameBasicTest {

    @Test
    public void nodeNameBasicTest() {
        Document document = new Document("http://example.com");
        String nodeName = document.nodeName();
        org.junit.Assert.assertEquals("", nodeName);
    }

}