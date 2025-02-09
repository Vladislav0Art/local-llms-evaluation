package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        List<Node> nodes = new XmlTreeBuilder().parseFragment("<p>Hello</p>", "http://google.com", Parser.xmlParser());
        assertEquals("p", nodes.get(0).nodeName());
        assertEquals("Hello", nodes.get(0).childNode(0).outerHtml());
    }

}