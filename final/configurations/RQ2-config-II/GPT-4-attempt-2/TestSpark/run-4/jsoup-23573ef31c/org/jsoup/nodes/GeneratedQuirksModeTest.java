package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("http://example.com");
        Document.QuirksMode mode = Document.QuirksMode.quirks;
        doc.quirksMode(mode);
        assertEquals(mode, doc.quirksMode());
    }

}