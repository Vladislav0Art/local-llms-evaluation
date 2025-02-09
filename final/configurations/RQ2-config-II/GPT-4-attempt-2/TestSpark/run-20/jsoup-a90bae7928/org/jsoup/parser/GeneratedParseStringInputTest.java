package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringInputTest {

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<root></root>", "http://example.com");
        assertNotNull(document);
        assertEquals("root", document.childNode(0).nodeName());
    }

}