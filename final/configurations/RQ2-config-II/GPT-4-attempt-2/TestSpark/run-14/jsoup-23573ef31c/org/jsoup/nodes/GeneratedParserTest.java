package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Parser parser = new Parser(new Document("http://baseUri.com"));
        Document document = new Document("http://baseUri.com");
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}