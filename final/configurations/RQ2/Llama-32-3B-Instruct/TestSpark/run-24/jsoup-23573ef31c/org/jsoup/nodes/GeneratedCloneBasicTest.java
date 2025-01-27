package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedCloneBasicTest {

    @Test
    public void cloneBasicTest() {
        Document document = new Document("http://example.com");
        Document clonedDocument = document.clone();
        org.junit.Assert.assertNotNull(clonedDocument);
    }

}