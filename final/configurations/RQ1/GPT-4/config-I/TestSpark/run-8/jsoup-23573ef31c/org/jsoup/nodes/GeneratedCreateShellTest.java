package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc);
        assertEquals("<html>\n <head></head>\n <body></body>\n</html>", doc.toString());
    }

}