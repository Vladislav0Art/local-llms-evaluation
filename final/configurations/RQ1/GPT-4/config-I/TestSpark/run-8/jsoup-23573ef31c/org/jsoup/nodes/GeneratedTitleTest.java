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

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document doc = Document.createShell("http://example.com");
        doc.title("Example");
        assertEquals("Example", doc.title());
    }

}