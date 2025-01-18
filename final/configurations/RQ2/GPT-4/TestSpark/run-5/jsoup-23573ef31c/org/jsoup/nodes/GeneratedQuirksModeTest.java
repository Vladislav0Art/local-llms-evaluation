package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://example.com");
        Document.QuirksMode quirksMode = Document.QuirksMode.NO_QUIRKS;
        document.quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

}