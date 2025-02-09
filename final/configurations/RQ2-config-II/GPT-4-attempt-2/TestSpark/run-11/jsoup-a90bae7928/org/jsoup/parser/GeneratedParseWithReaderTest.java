package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseWithReaderTest {

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com/";
        Document document = builder.parse(reader, baseUri);
        assertNotNull(document);
    }

}