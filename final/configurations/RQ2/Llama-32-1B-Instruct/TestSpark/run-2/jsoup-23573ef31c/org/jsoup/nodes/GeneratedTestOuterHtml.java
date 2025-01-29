package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestOuterHtml {

    @Test
    public void testOuterHtml() {
        Document document = new Document("https://example.com");
        String outerHtml = document.outerHtml();
        assertEquals("<html><body>Hello World</body></html>", outerHtml);
    }

}