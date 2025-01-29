package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedTestForms {

    private Document document = new Document("https://example.com");

    @Test
    public void testForms() {
        Elements forms = document.forms();
        assertEquals(0, forms.size());
    }

}