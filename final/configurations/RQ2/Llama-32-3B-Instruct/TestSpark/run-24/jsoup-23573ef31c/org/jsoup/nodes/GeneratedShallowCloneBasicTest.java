package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedShallowCloneBasicTest {

    @Test
    public void shallowCloneBasicTest() {
        Document document = new Document("http://example.com");
        Document shallowClonedDocument = document.shallowClone();
        org.junit.Assert.assertNotNull(shallowClonedDocument);
    }

}