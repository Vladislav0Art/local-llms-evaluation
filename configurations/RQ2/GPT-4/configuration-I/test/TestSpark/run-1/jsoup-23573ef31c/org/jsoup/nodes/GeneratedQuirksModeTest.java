package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://baseUri");
        document.quirksMode(QuirksMode.NO_QUIRKS);
        assertEquals(QuirksMode.NO_QUIRKS, document.quirksMode());
    }

}