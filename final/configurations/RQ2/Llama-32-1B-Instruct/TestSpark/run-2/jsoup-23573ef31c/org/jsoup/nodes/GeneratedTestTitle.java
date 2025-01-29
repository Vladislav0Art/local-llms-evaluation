package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestTitle {

    @Test
    public void testTitle() {
        Document document = new Document("https://example.com");
        assertEquals(title(), document.title());
    }

}