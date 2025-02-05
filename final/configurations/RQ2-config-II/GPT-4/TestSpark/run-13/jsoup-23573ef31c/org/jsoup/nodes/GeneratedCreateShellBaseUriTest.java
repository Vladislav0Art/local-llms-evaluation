package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedCreateShellBaseUriTest {

    @Test
    public void createShellBaseUriTest() {
        assertNotNull(Document.createShell("http://example.com"));
    }

}