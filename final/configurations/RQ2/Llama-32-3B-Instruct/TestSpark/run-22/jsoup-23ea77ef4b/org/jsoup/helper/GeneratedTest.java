package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void namespaceAwareTrueTest() {
        boolean result = new W3CDom().namespaceAware();
        assertTrue(result);
    }

    @Test
    public void namespaceAwareFalseTest() {
        boolean result = new W3CDom().namespaceAware(false);
        assertFalse(result);
    }

    @Test
    public void convertDocumentTest() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Selector.select("*").first();
        Document doc = W3CDom.convert(soup);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(doc), new StreamResult(outContent));
        String output = outContent.toString();
        assertTrue(output.contains("<html>"));
    }

    @Test
    public void asStringDocumentWithPropertiesTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        doc.appendChild(doc.createElement("div", null, null));
        assertEquals("<div></div>", W3CDom.asString(doc, new HashMap<String, String>() {{
            put("xml:space", "preserve");
        }}));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("xml:space", "preserve");
        Properties result = W3CDom.propertiesFromMap(map);
        assertEquals(map, result);
    }

    @Test
    public void OutputHtmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertEquals(StringUtil.toString(div), W3CDom.asString(doc, new HashMap<String, String>() {{
            put("xml:space", "preserve");
        }}));
    }

    @Test
    public void OutputXmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertEquals(StringUtil.toString(div), W3CDom.asString(doc));
    }

    @Test
    public void fromJsoupDocumentTest() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Selector.select("*").first();
        Document wDoc = W3CDom.fromJsoup(soup);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(wDoc), new StreamResult(outContent));
        String output = outContent.toString();
        assertTrue(output.contains("<html>"));
    }

    @Test
    public void fromJsoupElementTest() throws Exception {
        org.jsoup.nodes.Element element = soup.selectFirst("div");
        Document wDoc = W3CDom.fromJsoup(element);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(wDoc), new StreamResult(outContent));
        String output = outContent.toString();
        assertTrue(output.contains("<div></div>"));
    }

    @Test
    public void convertDocumentToSoupTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        org.jsoup.nodes.Document soup = W3CDom.convert(doc);
        assertNotNull(soup.body());
    }

    @Test
    public void selectXpathDocumentTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        NodeList nodeList = W3CDom.selectXpath("//div", doc);
        assertEquals(1, nodeList.getLength());
    }

    @Test
    public void selectXpathNodeTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        Node contextNode = doc.getDocumentElement();
        NodeList nodeList = W3CDom.selectXpath("//div", contextNode);
        assertEquals(1, nodeList.getLength());
    }

    @Test
    public void sourceNodesDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        NodeList nodeList = doc.getChildNodes();
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, result.size());
    }

    @Test
    public void contextNodeDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        Document wDoc = W3CDom.fromJsoup(doc);
        Node result = W3CDom.contextNode(wDoc);
        assertEquals(div, result);
    }

    @Test
    public void asStringDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        String result = W3CDom.asString(doc);
        assertTrue(result.contains("<html>"));
    }

}