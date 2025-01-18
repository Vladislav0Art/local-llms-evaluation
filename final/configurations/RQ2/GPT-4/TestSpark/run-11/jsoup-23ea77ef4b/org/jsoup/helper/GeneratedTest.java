package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void convertTest() throws Exception {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document("");
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

    @Test
    public void asStringDocumentPropertiesTest() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document = dBuilder.newDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put("INDENT", "yes");
        properties.put("ENCODING", "UTF-8");

        W3CDom w3CDom = new W3CDom();
        String result = w3CDom.asString(document, properties);
        assertNotNull(result);
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertEquals("html", result.get("METHOD"));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertEquals("xml", result.get("METHOD"));
    }

    @Test
    public void fromJsoupDocumentTest() throws Exception {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document("");
        W3CDom w3CDom = new W3CDom();
        Document result = w3CDom.fromJsoup(in);
        assertNotNull(result);
    }

    @Test
    public void fromJsoupElementTest() throws Exception {
        Element in = new Element(Tag.valueOf("p"), "");
        W3CDom w3CDom = new W3CDom();
        Document result = w3CDom.fromJsoup(in);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("METHOD", "xml");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals("xml", properties.get("METHOD"));
    }

    @Test
    public void contextNodeTest() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document wDoc = dBuilder.newDocument();
        W3CDom w3CDom = new W3CDom();
        Node result = w3CDom.contextNode(wDoc);
        assertNotNull(result);
    }

    @Test
    public void asStringDocumentTest() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        W3CDom w3CDom = new W3CDom();
        String result = w3CDom.asString(doc);
        assertNotNull(result);
    }

}