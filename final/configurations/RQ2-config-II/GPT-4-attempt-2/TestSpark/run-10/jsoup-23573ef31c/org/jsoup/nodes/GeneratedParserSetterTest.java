package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParserSetterTest {

    @Test
    public void parserSetterTest() {
        Document document = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}