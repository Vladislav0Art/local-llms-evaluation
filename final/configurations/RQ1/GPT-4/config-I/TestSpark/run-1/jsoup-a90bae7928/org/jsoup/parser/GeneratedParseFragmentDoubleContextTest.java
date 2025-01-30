package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.TokenQueue;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentDoubleContextTest {

    @Test
    public void parseFragmentDoubleContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List nodeList = xmlTreeBuilder.parseFragment("<root></root>", null, "www.example.com", Parser.xmlParser());
        assertTrue(nodeList.get(0) instanceof org.jsoup.nodes.Element);
    }

}