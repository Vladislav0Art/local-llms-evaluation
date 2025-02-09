package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void W3CDomConstructorTest() {
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom);
    }

    @Test
    public void namespaceAwareTrueTest() {
        W3CDom w3cDom = new W3CDom();
        W3CDom result = w3cDom.namespaceAware(true);
        assertTrue(result.namespaceAware());
    }

    @Test
    public void namespaceAwareFalseTest() {
        W3CDom w3cDom = new W3CDom();
        W3CDom result = w3cDom.namespaceAware(false);
        assertFalse(result.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document in = Jsoup.parse("<html><body>Hello</body</html>");
        Document result = W3CDom.convert(in);
        assertEquals("#document", result.getNodeName());
    }

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document in = Jsoup.parse("<html><body>Hello</body</html>");
        Document document = W3CDom.convert(in);
        String result = W3CDom.asString(document);
        assertTrue(result.contains("Hello"));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("method", "html");
        map.put("indent", "yes");
        java.util.Properties result = W3CDom.propertiesFromMap(map);
        assertEquals("html", result.getProperty("method"));
        assertEquals("yes", result.getProperty("indent"));
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertTrue(result.containsKey("method"));
        assertTrue(result.containsKey("indent"));
        assertTrue(result.containsKey("omit-xml-declaration"));
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertTrue(result.containsKey("method"));
		.assertTrue(result.containsKey("indent"));
        assertTrue(result.containsKey("omit-xml-declaration"));
    }

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element("div").text("Hello Jsoup");
        Document result = new W3CDom().fromJsoup(element);
        assertEquals("div", result.getDocumentElement().getNodeName());
    }

    @Test
    public void fromJsoupDocumentTest() {
        org.jsoup.nodes.Document document = Jsoup.parse("<html><body>Hello Jsoup</body></html>");
        Document result = new W3CDom().fromJsoup(document);
        assertEquals("body", result.getDocumentElement().getFirstChild().getNodeName());
    }

    @Test
    public void contextNodeTest() {
        org.jsoup.nodes.Document in = Jsoup.parse("<html><body>Hello</body</html>");
        Node contextNode = new W3CDom().contextNode(W3CDom.convert(in));
        assertEquals("#document", contextNode.getNodeName());
    }

    @Test
    public void sourceNodesTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Hello</p><div>World</div></body</html>");
        Document w3CDoc = W3CDom.convert(jsoupDoc);
        NodeList nodeList = w3CDoc.getElementsByTagName("*");
        List<Node> list = new W3CDom().sourceNodes(nodeList, Node.class);
        assertEquals(4, list.size());
    }

}