package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("http://google.com");
        doc.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

}