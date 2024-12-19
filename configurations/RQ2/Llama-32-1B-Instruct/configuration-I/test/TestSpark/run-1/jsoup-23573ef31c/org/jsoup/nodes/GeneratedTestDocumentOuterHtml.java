package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestDocumentOuterHtml {

    @Test
    public void testDocumentOuterHtml() {
        Document document = new Document("https://example.com");
        String outerHtml = document.outerHtml();
        assertEquals("<html><head></head><body>Example Content</body></html>", outerHtml);
    }

}