package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedQuirksModeTest {

    // Test constructor

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://localhost");
        document.quirksMode(QuirksMode.quirks);
        assertEquals(QuirksMode.quirks, document.quirksMode());
    }

}