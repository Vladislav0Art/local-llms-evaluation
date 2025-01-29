package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestCreateElement {

    private Document document = new Document("");

    @Test
    public void testCreateElement() {
        String tagName = "div";
        when(document.createElement(tagName)).thenReturn(createElement("div"));
        Document result = document.createElement(tagName);
        assertNotNull(result);
        verify(createElement(tagName)).createElement(tagName);
    }

}