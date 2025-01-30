package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("");
        doc.quirksMode(Document.QuirksMode.quirks);

        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

}