package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<root></root>");
        Document doc = xmlTreeBuilder.parse(input, "baseUri");

        assertNotNull(doc);
    }

}