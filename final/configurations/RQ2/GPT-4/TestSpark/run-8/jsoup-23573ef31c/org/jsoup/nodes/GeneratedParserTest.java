package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("https://example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}