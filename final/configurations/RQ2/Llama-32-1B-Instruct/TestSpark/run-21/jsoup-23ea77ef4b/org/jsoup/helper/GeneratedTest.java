package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testNamespaceAware() {
        W3CDom doc = new W3CDom();
        boolean result = doc.namespaceAware();
        assertTrue(result);
    }

    @Test
    public void testNamespaceAwareConstructor() {
        W3CDom doc = new W3CDom();
        Properties properties = null;
        Map<String, String> map = null;

        // Mocking not used in this case

        Document document = org.jsoup.nodes.Document.parse("html");
        assertEquals(true, doc.namespaceAware(document));
    }

    @Test
    public void testNamespaceAwarePropertiesFromMap() {
        W3CDom doc = new W3CDom();
        Properties properties = Properties.fromMap(new HashMap<String, String>() {{
            put("namespace", "http://example.com");
        }});
        assertEquals(1, properties.size());

        Map<String, String> map = null;
        String result = doc.propertiesFromMap(properties);
        assertTrue(map.equals(result));
    }

    @Test
    public void testOutputHtml() {
        W3CDom doc = new W3CDom();
        String html = "<html><body>Hello World!</body></html>";
        assertEquals("<html><body>Hello World!</body></html>", doc.outputHtml(html));
    }

    @Test
    public void testOutputXml() {
        W3CDom doc = new W3CDom();
        String xml = "<html><body>Hello World!</body></html>";
        assertEquals("<html xmlns=\"http://example.com\"><body>Hello World!</body></html>", doc.outputXml(xml));
    }

    @Test
    public void testFromJsoup() {
        W3CDom doc1 = new W3CDom();
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.parse("html");
        Document document2 = new W3CDom().fromJsoup(document1);

        org.jsoup.nodes.Element element1 = document1.select("body").first();
        org.jsoup.nodes.Element element2 = document2.select("body").first();

        assertEquals(element1, element2);
    }

    @Test
    public void testConvert() {
        W3CDom doc = new W3CDom();
        Document document = new org.jsoup.nodes.Document();
        doc.convert(document);

        org.jsoup.nodes.Document convertedDocument = new org.jsoup.nodes.Document();
        assertSame(convertedDocument, doc.convert(document));
    }

    @Test
    public void testSelectXpath() {
        W3CDom doc1 = new W3CDom();
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document();
        String xpath1 = "body";
        NodeList nodeList1 = doc1.selectXpath(xpath1, document1);

        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document();
        String xpath2 = "body";
        NodeList nodeList2 = doc1.selectXpath(xpath2, document2);

        assertEquals(nodeList1, nodeList2);
    }

    @Test
    public void testSourceNodes() {
        W3CDom doc = new W3CDom();

        List<Node> list = new ArrayList<>();
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document();
        Node node = new org.jsoup.nodes.Element(document1);
        list.add(node);

        Document doc2 = new org.jsoup.nodes.Document();
        String xpath = "/html/body";
        Selector selector = new org.jsoup.select.Selector(xpath, null);
        NodeList nodeList = doc2.selectXpath(xpath, selector);
        list.add(nodeList);

        Node contextNode = new org.jsoup.nodes.Document(document1);
        list.add(contextNode);

        assertTrue(doc.sourceNodes(list, org.jsoup.nodes.Node.class).isEmpty());
    }

    @Test
    public void testContextNode() {
        W3CDom doc = new W3CDom();
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document();

        Document doc2 = new org.jsoup.nodes.Document(document1);
        org.jsoup.nodes.Element element = doc2.select("body").first();

        assertTrue(doc.contextNode(document2).equals(element));
    }

}