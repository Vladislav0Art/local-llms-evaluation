package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testNamespaceAware() {
        W3CDom instance = new W3CDom();
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        assert instance.namespaceAware(document);
    }

    @Test
    public void testNamespaceAwareConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        assert instance.namespaceAware(true);
    }

    @Test
    public void testNamespaceAwareMethods() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        W3CDom.W3CDom convertMethod = () -> {
            return document;
        };
        assert instance.namespaceAware(convertMethod);
    }

    @Test
    public void testNamespaceAwareSelectXpath() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        NodeList selectXpaths = instance.selectXpath("/*", document);
        assert selectXpaths.getLength() == 2;
    }

    @Test
    public void testNamespaceAwareSelectXpathConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        NodeList selectXpaths = instance.selectXpath("/*", document);
        assert selectXpaths.getLength() == 2;
    }

    @Test
    public void testSourceNodes() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        List<Node> sourceNodesList = new ArrayList<>();
        W3CDom.instance.sourceNodes(null, sourceNodesList);
        assert sourceNodesList.contains(document.body());
    }

    @Test
    public void testSourceNodesConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        List<Node> sourceNodesList = new ArrayList<>();
        instance.sourceNodes(null, sourceNodesList);
        assert sourceNodesList.contains(document.body());
    }

    @Test
    public void testContextNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Element element = document.createElementNS("http://www.w3.org/1999/xhtml", "div");
        instance.contextNode(document, element);
    }

    @Test
    public void testAsString() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        String asString = instance.asString(document);
        assert asString.equals("<html><body>Hello World!</body></html>");
    }

    @Test
    public void testOutputHtml() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Map<String, String> properties = new HashMap<>();
        instance.OutputHtml(properties);
        assert PropertiesUtils.equals(document.getPropertyValue("xmlns"), "http://www.w3.org/1999/xhtml");
    }

    @Test
    public void testOutputXml() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Map<String, String> properties = new HashMap<>();
        instance.OutputXml(properties);
        assert PropertiesUtils.equals(document getPropertyValue("xmlns"), "http://www.w3.org/1999/xhtml");
    }

    @Test
    public void testFromJsoup() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Document fromJsoupMethod = instance.fromJsoup(document);
        assert fromJsoupMethod instanceof org.jsoup.nodes.Document;
    }

    @Test
    public void testFromJsoupConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Document fromJsoupConstructorMethod = instance.fromJsoup(document);
        assert fromJsoupConstructorMethod instanceof org.jsoup.nodes.Document;
    }

}