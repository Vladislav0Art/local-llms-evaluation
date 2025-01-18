package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Parser parser = Parser.htmlParser();
        Document doc = new Document("https://example.com");
        doc = doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}