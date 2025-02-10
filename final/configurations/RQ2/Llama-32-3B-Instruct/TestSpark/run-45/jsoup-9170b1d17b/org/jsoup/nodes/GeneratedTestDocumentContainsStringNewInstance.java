package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;

public class GeneratedTestDocumentContainsStringNewInstance {

    @Test
    public void testDocumentContainsStringNewInstance() {
        Document document = new Document();
        String expectedHtml = "<p>Hello, World!</p>";
        boolean result = document.containsString(expectedHtml);

        assertTrue(result);
    }

}