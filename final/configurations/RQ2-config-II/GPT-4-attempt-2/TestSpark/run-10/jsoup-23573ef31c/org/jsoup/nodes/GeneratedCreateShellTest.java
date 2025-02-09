package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
        assertEquals("<html>\n <head></head>\n <body></body>\n</html>", document.toString());
    }

}