package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = (Element) xmlTreeBuilder.parseFragment("<tag>content</tag>", "http://base.uri/", new Parser(xmlTreeBuilder))
                .get(0).childNode(0);
        assertEquals("tag", element.nodeName());
        assertEquals("content", element.childNode(0).outerHtml());
    }

}