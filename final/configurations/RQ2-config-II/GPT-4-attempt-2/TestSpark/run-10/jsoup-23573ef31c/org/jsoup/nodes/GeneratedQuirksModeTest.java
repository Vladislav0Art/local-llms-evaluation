package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc.quirksMode());
    }

}