package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        String baseUri = "http://example.com";
        Document doc = Document.createShell(baseUri);
        assertEquals(baseUri, doc.location());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

}