package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefault() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSet() {
        boolean result = W3CDom.namespaceAware(true);
        assertTrue(result);
    }

    @Test
    public void convertDocument() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document wDoc = W3CDom.convert(doc);
        assertNotNull(wDoc);
    }

    @Test
    public void asStringDocumentWithProperties() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        String result = W3CDom.asString(doc, new HashMap<String, String>());
        assertTrue(result.contains("<html>"));
    }

    @Test
    public void propertiesFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("method", "POST");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

    @Test
    public void outputHtml() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        HashMap<String, String> result = W3CDom.OutputHtml(doc);
        assertNotNull(result);
    }

    @Test
    public void outputXml() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        HashMap<String, String> result = W3CDom.OutputXml(doc);
        assertNotNull(result);
    }

    @Test
    public void fromJsoupDocument() {
        Document in = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document wDoc = W3CDom.fromJsoup(in);
        assertNotNull(wDoc);
    }

    @Test
    public void fromJsoupElement() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        Element in = doc.createElement("div");
        Document wDoc = W3CDom.fromJsoup(in);
        assertNotNull(wDoc);
    }

    @Test
    public void convertDocumentMethod() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document out = new Document();
        W3CDom.convert(doc, out);
        assertTrue(out.getTree().trim().equals(doc.getTree().trim()));
    }

    @Test
    public void convertElementMethod() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        Element in = doc.createElement("div");
        Document out = new Document();
        W3CDom.convert(in, out);
        assertTrue(out.getTree().trim().equals(in.getTree().trim()));
    }

    @Test
    public void selectXpath() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        NodeList nodeList = doc.getElementsByTagName("div");
        NodeList result = W3CDom.selectXpath("//div", doc);
        assertEquals(nodeList.getLength(), result.getLength());
    }

    @Test
    public void contextNodeDocument() {
        Document wDoc = new Document();
        Node node = W3CDom.contextNode(wDoc);
        assertNotNull(node);
    }

}