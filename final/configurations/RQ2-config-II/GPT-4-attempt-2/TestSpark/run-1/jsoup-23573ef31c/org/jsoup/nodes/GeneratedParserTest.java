package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("");
        Parser parser = Parser.htmlParser();
        assertSame(doc, doc.parser(parser));
        assertSame(parser, doc.parser());
    }

}