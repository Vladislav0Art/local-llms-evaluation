package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestDocumentTitle {

    @Test
    public void testDocumentTitle() {
        Document document = new Document("https://example.com");
        assertEquals("", document.title());
        assertEquals("Example Document", document.title("Example Document"));
    }

}