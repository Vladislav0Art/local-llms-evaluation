package org.jsoup.parser;

import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.parse(new StringReader("<tag>"), "http://baseUri.com"));
    }

}