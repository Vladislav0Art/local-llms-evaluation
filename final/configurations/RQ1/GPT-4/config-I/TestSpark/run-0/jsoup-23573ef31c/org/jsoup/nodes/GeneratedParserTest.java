package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);

        assertSame(parser, doc.parser());
    }

}