package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedQuirksModeBasicTest {

    @Test
    public void quirksModeBasicTest() {
        Document document = new Document("http://example.com");
        QuirksMode quirksMode = document.quirksMode();
        org.junit.Assert.assertNull(quirksMode);
    }

}