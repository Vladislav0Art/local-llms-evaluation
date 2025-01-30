package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseStringBaseUriTest {

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<tag>content</tag>", "http://base.uri/");
        assertEquals("tag", document.select("tag").first().tagName());
        assertEquals("content", document.select("tag").first().text());
    }

}