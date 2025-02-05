package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom dom = new W3CDom();
        boolean actual = dom.namespaceAware();
        assertNotNull(actual);
    }

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom dom = new W3CDom();
        dom = dom.namespaceAware(false);
        assertNotNull(dom);
        assertFalse(dom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document document = new Document("");
        org.w3c.dom.Document actual = W3CDom.convert(document);
        assertNotNull(actual);
    }

    @Test
    public void asStringDocumentMapTest() {
        org.w3c.dom.Document doc = W3CDom.convert(new Document(""));
        Map<String, String> properties = new HashMap<>();
        properties.put("property", "value");
        String actual = W3CDom.asString(doc, properties);
        assertNotNull(actual);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties actual = W3CDom.propertiesFromMap(map);
        assertNotNull(actual);
        assertEquals("value", actual.getProperty("key"));
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> actual = W3CDom.OutputHtml();
        assertNotNull(actual);
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> actual = W3CDom.OutputXml();
        assertNotNull(actual);
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom dom = new W3CDom();
        Document document = new Document("");
        org.w3c.dom.Document actual = dom.fromJsoup(document);
        assertNotNull(actual);
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom dom = new W3CDom();
        Element element = new Element("element");
        org.w3c.dom.Document actual = dom.fromJsoup(element);
        assertNotNull(actual);
    }

    @Test
    public void convertDocumentDomTest() {
        W3CDom dom = new W3CDom();
        Document document = new Document("");
        org.w3c.dom.Document out = W3CDom.convert(new Document(""));
        dom.convert(document, out);
        assertNotNull(out);
    }

    @Test
    public void convertElementDomTest() {
        W3CDom dom = new W3CDom();
        Element element = new Element("element");
        org.w3c.dom.Document out = W3CDom.convert(new Document(""));
        dom.convert(element, out);
        assertNotNull(out);
    }

    @Test
    public void selectXpathDocumentTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document doc = W3CDom.convert(new Document(""));
        NodeList actual = dom.selectXpath("/", doc);
        assertNotNull(actual);
    }

    @Test
    public void selectXpathNodeTest() {
        W3CDom dom = new W3CDom();
        Node node = W3CDom.convert(new Document("")).getFirstChild();
        NodeList actual = dom.selectXpath("/", node);
        assertNotNull(actual);
    }

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        NodeList nodeList = W3CDom.convert(new Document("")).getChildNodes();
        List<org.jsoup.nodes.Node> actual = dom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(actual);
    }

    @Test
    public void contextNodeTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document doc = W3CDom.convert(new Document(""));
        Node actual = dom.contextNode(doc);
        assertNotNull(actual);
    }

    @Test
    public void asStringDocumentTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document doc = W3CDom.convert(new Document(""));
        String actual = dom.asString(doc);
        assertNotNull(actual);
    }

}