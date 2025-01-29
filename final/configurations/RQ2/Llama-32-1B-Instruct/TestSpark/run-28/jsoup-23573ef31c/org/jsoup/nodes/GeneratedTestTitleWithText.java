package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedTestTitleWithText {

    private Document document = new Document("https://example.com");

    @Test
    public void testTitleWithText() {
        Element element = document.createElement("title");
        element.setText("Example Title");
        document.title(element);
        assertEquals("Example Title", document.title());
    }

}