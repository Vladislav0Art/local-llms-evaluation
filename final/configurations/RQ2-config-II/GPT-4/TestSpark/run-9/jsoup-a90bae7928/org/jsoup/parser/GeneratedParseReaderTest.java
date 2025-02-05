package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        Reader reader = new StringReader("<tag>content</tag>");
        Document doc = new XmlTreeBuilder().parse(reader, "http://baseUri.com");
        assertNotNull(doc);
    }

}