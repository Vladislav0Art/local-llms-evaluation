package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.nio.charset.Charset;
import java.util.List;

import org.jsoup.parser.Parser;

public class GeneratedParserSetGetTest {

    @Test
    public void parserSetGetTest() {
        Document doc = new Document("http://www.example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}