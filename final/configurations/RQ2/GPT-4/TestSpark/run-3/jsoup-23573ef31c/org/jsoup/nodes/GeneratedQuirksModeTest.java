package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("http://example.com");
        QuirksMode quirksMode = QuirksMode.quirks;
        doc.quirksMode(quirksMode);
        assertEquals(quirksMode, doc.quirksMode());
    }

}