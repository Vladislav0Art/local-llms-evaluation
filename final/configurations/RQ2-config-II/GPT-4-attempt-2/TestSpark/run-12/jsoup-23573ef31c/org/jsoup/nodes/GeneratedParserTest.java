package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Parser parser = new Parser(new Document("http://example.com/"));
        Document doc = new Document("http://example.com/").parser(parser);
        assertEquals(parser, doc.parser());
    }

}