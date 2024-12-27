package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParserSetTest {

    @Test
    public void parserSetTest() {
        Document document = new Document("http://baseUri");
        Parser parser = Parser.htmlParser();
        document = document.parser(parser);
        assertEquals(parser, document.parser());
    }

}