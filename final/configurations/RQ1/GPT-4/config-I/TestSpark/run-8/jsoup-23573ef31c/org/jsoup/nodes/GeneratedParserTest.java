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

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}