package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc.parser());
    }

}