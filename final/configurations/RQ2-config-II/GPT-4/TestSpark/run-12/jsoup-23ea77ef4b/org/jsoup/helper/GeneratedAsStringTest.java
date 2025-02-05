package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void asStringTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        String xmlDocString = w3cDom.asString(xmlDom);

        assertNotNull(xmlDocString);
        assertTrue(xmlDocString.contains("<test>Hello world!</test>"));
    }

    // Generating a mock w3c dom document for testing
    private org.w3c.dom.Document generateMockDocument() {
        org.w3c.dom.Document xmlDom = null;
        try {
            xmlDom = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            org.w3c.dom.Element rootElement = xmlDom.createElement("test");
            rootElement.setTextContent("Hello world!");
            xmlDom.appendChild(rootElement);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return xmlDom;
    }

}