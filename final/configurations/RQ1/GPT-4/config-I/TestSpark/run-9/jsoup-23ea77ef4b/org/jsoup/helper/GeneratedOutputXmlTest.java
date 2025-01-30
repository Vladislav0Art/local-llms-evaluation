package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        Map<String, String> outputXml = W3CDom.OutputXml();
        assertEquals(1, outputXml.size());
        assertTrue(outputXml.containsKey("method"));
        assertEquals("xml", outputXml.get("method"));
    }

}