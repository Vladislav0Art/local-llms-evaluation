package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        Map<String, String> outputXml = W3CDom.OutputXml();
        assertNotNull(outputXml);
        assertEquals("xml", outputXml.get("method"));
    }

}