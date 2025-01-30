package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("http://google.com");
        Parser parser = Parser.xmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}