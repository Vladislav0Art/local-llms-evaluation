package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseReaderInputAndBaseUriTest {

    @Test
    public void parseReaderInputAndBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<book>Java</book>"), "http://sample.com");
        assertTrue(doc instanceof Document);
    }

}