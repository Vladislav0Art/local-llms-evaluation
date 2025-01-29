package org.jsoup.helper;

public class GeneratedTest {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void namespaceAware() {
        W3CDom w3cdom = new W3CDom();
        assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAwareNotRequired() {
        W3CDom w3cdom = new W3CDom();
        assertFalse(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithMap() {
        Map<String, String> map = new HashMap<>();
        map.put("namespace", "ns");
        document = W3CDom.convert(map);
        assertTrue(document.hasAttribute("namespace"));
    }

    @Test
    public void outputHtml() {
        Properties properties = new Properties();
        properties.setProperty("format", "html5");
        document = W3CDom.fromJsoup(document);
        String html = W3CDom.asString(document, properties);
        assertEquals("<!DOCTYPE html><html><body></body></html>", html);
    }

    @Test
    public void outputXml() {
        Properties properties = new Properties();
        Document doc = W3CDom.OutputHtml().getDocument();
        document = doc;
        String xml = W3CDom.asString(doc, properties);
        assertEquals("<!DOCTYPE html><html><body></body></html>", xml);
    }

    @Test
    public void convert() {
        org.jsoup.nodes.Document in = new DocumentBuilder().build("test.xml").newDocument();
        document = W3CDom.fromJsoup(in);
        output = W3CDom.fromJsoup(document);
        assertEquals(document, output);
    }

    @Test
    public void fromJsoupWithElement() {
        org.jsoup.nodes.Element in = new DocumentBuilderFactory.newInstance().newDocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        document = W3CDom.fromJsoup(in);
        output = W3CDom.fromJsoup(document);
        assertEquals(in, output);
    }

    @Test
    public void selectXpath() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        NodeList list = document.select("p");
        assertEquals(1, list.getLength());
        String xpath = "p";
        output = W3CDom.SelectXpath(xpath, doc);
        System.out.println(output.toString());
    }

    @Test
    public void selectXpathWithNodeContext() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        NodeList list = document.select("p");
        assertEquals(1, list.getLength());
        String xpath = "p";
        Node contextNode = W3CDom.contextNode(doc);
        output = W3CDom.SelectXpath(xpath, contextNode);
        System.out.println(output.toString());
    }

    @Test
    public void sourceNodes() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        NodeList list = document.sourceNodes(new org.jsoup.nodes.NodeList(), org.jsoup.nodes.Node.class);
        assertEquals(1, list.getLength());
        String xpath = "p";
        output = W3CDom.SelectXpath(xpath, doc);
        System.out.println(output.toString());
    }

    @Test
    public void contextNodeWithJsoup() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        org.jsoup.nodes.Document jsoupDoc = W3CDom.fromJsoup(doc);
        String xml = W3CDom.asString(jsoupDoc, null);
        assertEquals("<html><body><p>Hello World!</p></body></html>", xml);
    }

}