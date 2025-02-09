package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Properties;

public class GeneratedTest {

    @Test
    public void W3CDomInitializationTest() {
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom);
    }

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        boolean namespaceAware = w3cDom.namespaceAware();
        assertEquals(false, namespaceAware);

        w3cDom = w3cDom.namespaceAware(true);
        namespaceAware = w3cDom.namespaceAware();
        assertEquals(true, namespaceAware);
    }

    @Test
    public void convertDocumentTest() throws ParserConfigurationException {
        Document jsoupDoc = Parser.parse("<html></html>", "");
        org.w3c.dom.Document xmlDoc = W3CDom.convert(jsoupDoc);
        assertNotNull(xmlDoc);
        assertEquals("#document", xmlDoc.getNodeName());
    }

    @Test
    public void asStringTest() throws ParserConfigurationException {
        Document jsoupDoc = Parser.parse("<html></html>", "");
        org.w3c.dom.Document xmlDoc = W3CDom.convert(jsoupDoc);
        String xmlString = W3CDom.asString(xmlDoc, null);
        assertTrue(xmlString.startsWith("<?xml version=" 1.0 " encoding=" UTF - 8 "?><html/>"));
    }

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
        assertEquals("value1", properties.getProperty("key1"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
        assertEquals("html", outputHtml.get(OutputKeys.METHOD));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        assertNotNull(outputXml);
        assertEquals("xml", outputXml.get(OutputKeys.METHOD));
    }

    @Test
    public void fromJsoupTest() throws ParserConfigurationException {
        Document jsoupDoc = Parser.parse("<html></html>", "");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document xmlDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(xmlDoc);
        assertEquals("#document", xmlDoc.getNodeName());
    }

    @Test
    public void convertToDocumentTest() throws ParserConfigurationException {
        Document jsoupDoc = Parser.parse("<html></html>", "");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document xmlDoc = w3cDom.fromJsoup(jsoupDoc);
        w3cDom.convert(jsoupDoc, xmlDoc);
        assertNotNull(xmlDoc);
        assertEquals("#document", xmlDoc.getNodeName());
    }

}