package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedTestExpectForm {

    private Document document = new Document("https://example.com");

    @Test
    public void testExpectForm() {
        Element formElement = document.expectForm("#my-form");
        assertNotNull(formElement);
        assertTrue(formElement.tagName().equals("form"));
    }

}