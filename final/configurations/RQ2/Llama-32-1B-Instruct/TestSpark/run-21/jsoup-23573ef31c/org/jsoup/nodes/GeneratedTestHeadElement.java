package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestHeadElement {

    private Element doc;

    @BeforeEach
    public void setup() {
        String baseUri = "http://example.com";
        doc = new Document(baseUri);
    }

    @Test
    public void testHeadElement() {
        assertEquals("<html>", doc.head().outerHtml());
        assertEquals("http://example.com/base.html", doc.head().href());
        Mockito.when(doc.connection()).thenReturn(Mockito.any(Connection.class));
    }

}