package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void namespaceAwareTrueTest() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareFalseTest() {
        assertFalse(W3CDom.namespaceAware(false));
    }

    @Test
    public void namespaceAwareSetTest() {
        W3CDom dom = new W3CDom();
        dom.namespaceAware(true);
        assertTrue(dom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        Document wDoc = W3CDom.convert(doc);
        assertNotNull(wDoc);
    }

    @Test
    public void asStringTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        Properties props = W3CDom.propertiesFromMap(map);
        assertNotNull(props);
    }

    @Test
    public void OutputHtmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
    }

    @Test
    public void OutputXmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document domDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        Document wDoc = W3CDom.fromJsoup(domDoc);
        assertNotNull(wDoc);
    }

    @Test
    public void fromJsoupElementTest() {
        Element domElem = doc().element();
        Document wDoc = W3CDom.fromJsoup(domElem);
        assertNotNull(wDoc);
    }

    @Test
    public void convertDocumentConvertTest() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        StringWriter sw = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(new DOMSource(doc()), new StreamResult(sw));
        String result = sw.toString();
        assertEquals(result, W3CDom.convert(W3CDom.fromJsoup(new Document())).asString(null));
    }

    @Test
    public void selectXpathDocumentTest() throws ParserConfigurationException, XPathExpressionException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        NodeList nodeList = W3CDom.selectXpath("//test", doc);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathNodeTest() throws ParserConfigurationException, XPathExpressionException {
        Element domElem = doc().element();
        NodeList nodeList = W3CDom.selectXpath("//test", domElem);
        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        NodeList nodeList = W3CDom.selectXpath("//test", doc);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(result);
    }

    @Test
    public void contextNodeDocumentTest() {
        Document wDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        Node result = W3CDom.contextNode(wDoc);
        assertNotNull(result);
    }

    @Test
    public void asStringDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }
}

class Utils {

    private static Document doc() {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
    }

}