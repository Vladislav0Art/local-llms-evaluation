package org.jsoup.helper;

public class GeneratedTest {

    @MethodUnderTest
    private static Document convert(org.jsoup.nodes.Document in) {
        return in;
    }

    @MethodUnderTest
    private static String asString(Document doc, @Nullable Map<String, String> properties) {
        return (properties == null || properties.isEmpty()) ? "" : String.join(", ", properties.keySet());
    }

    @Test
    public void test_convertJsoupToDom() {
        Document in = org.jsoup.nodes.Document.parse("http://example.com");
        Document out = W3CDom.convert(in);
        Assert.assertEquals(in, out);
    }

    @MethodUnderTest
    private static HashMap<String, String> OutputHtml() {
        return new HashMap<>();
    }

    @MethodUnderTest
    public void test_output_html() {
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        Assert.assertEquals(OutputHtml(), doc);
    }

    @Test
    public void test_output_xml() {
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        Assert.assertEquals(OutputXml(), doc);
    }

    @MethodUnderTest
    private static HashMap<String, String> OutputXml() {
        return new HashMap<>();
    }

    @MethodUnderTest
    public void test_output_xml() {
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        Assert.assertEquals(OutputXml(), doc);
    }

    @Test
    public void test_selectXpath() {
        String xpath = "//*";
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        NodeList nodeList = W3CDom.selectXpath(xpath, doc);
        Assert.assertEquals(0, nodeList.getLength());
    }

    @MethodUnderTest
    private static NodeList selectXpath(String xpath, Node contextNode) {
        return (contextNode == null || contextNode.getNodeName().startsWith(xpath)) ? Collections.emptyList() : W3CDom.sourceNodes(selectXpath(xpath, contextNode), org.jsoup.nodes.Node.class);
    }

    @Test
    public void test_source_nodes() {
        String xpath = "//body";
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        List<Node> nodeList = W3CDom.sourceNodes(selectXpath(xpath, doc), org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, nodeList.size());
    }

    @MethodUnderTest
    private static Node contextNode(Document wDoc) {
        return wDoc.getDocumentElement();
    }

}