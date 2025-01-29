package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCharset {

    private Element doc;

    @BeforeEach
    public void setup() {
        String baseUri = "http://example.com";
        doc = new Document(baseUri);
    }

    @Test
    public void testCharset() {
        Charset charset = "utf-8";
        Mockito.when(doc.charset(charset)).thenReturn(charset);
        assertEquals("utf-8", doc.charset().toString());
    }

}