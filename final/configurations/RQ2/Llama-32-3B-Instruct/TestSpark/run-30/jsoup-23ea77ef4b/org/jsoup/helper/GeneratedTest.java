package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefault() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetToFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

    @Test
    public void convertJsoupDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = factory.newDocumentBuilder().parse(new ByteArrayInputStream("<html></html>".getBytes()));
        Document convertedDoc = W3CDom.convert(document);
        assertNotNull(convertedDoc.getDocumentElement());
    }

    @Test
    public void asStringJsoupDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        document.appendChild(document.createElement("div"));
        String output = W3CDom.asString(document, null);
        assertTrue(output.contains("<div>"));
    }

    @Test
    public void propertiesFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

    @Test
    public void outputHtml() {
        HashMap<String, String> output = W3CDom.OutputHtml();
        assertTrue(output.containsKey("html"));
    }

    @Test
    public void outputXml() {
        HashMap<String, String> output = W3CDom.OutputXml();
        assertTrue(output.containsKey("xml"));
    }

    @Test
    public void fromJsoupDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html></html>".getBytes()));
        Document convertedDoc = W3CDom.fromJsoup(document);
        assertNotNull(convertedDoc.getDocumentElement());
    }

    @Test
    public void fromJsoupElement() {
        Element element = org.jsoup.nodes.Document.parse("<div>Hello World!</div>").getElementsByTag("div").first();
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc.getDocumentElement());
    }

    @Test
    public void convertJsoupElementToDocument() throws Exception {
        Element element = org.jsoup.nodes.Document.parse("<div>Hello World!</div>").getElementsByTag("div").first();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html></html>".getBytes()));
        W3CDom.convert(element, document);
        assertNotNull(document.getDocumentElement());
    }

    @Test
    public void convertJsoupElementToDocumentEmpty() throws Exception {
        Element element = org.jsoup.nodes.Document.parse("<div>Hello World!</div>").getElementsByTag("div").first();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html></html>".getBytes()));
        W3CDom.convert(element, new Document());
        assertNotNull(document.getDocumentElement());
    }

    @Test
    public void selectXpath() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body><div>Hello World!</div></body></html>".getBytes()));
        NodeList nodeList = W3CDom.selectXpath("//div", document);
        assertEquals(1, nodeList.getLength());
    }

    @Test
    public void selectXpathEmpty() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body></body></html>".getBytes()));
        NodeList nodeList = W3CDom.selectXpath("//div", document);
        assertEquals(0, nodeList.getLength());
    }

    @Test
    public void sourceNodesList() {
        List<Node> nodes = new ArrayList<>();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body><div>Hello World!</div></body></html>".getBytes()));
        NodeList nodeList = W3CDom.selectXpath("//div", document);
        for (Node node : nodeList) {
            nodes.add((Node) node);
        }
        assertEquals(1, nodes.size());
    }

    @Test
    public void contextNodeDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body><div>Hello World!</div></body></html>".getBytes()));
        Document wDoc = W3CDom.contextNode(document);
        assertNotNull(wDoc.getDocumentElement());
    }

    @Test
    public void asStringDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream("<html><body><div>Hello World!</div></body></html>".getBytes()));
        String output = W3CDom.asString(document);
        assertTrue(output.contains("<html><body><div>Hello World!</div></body></html>"));
    }

}