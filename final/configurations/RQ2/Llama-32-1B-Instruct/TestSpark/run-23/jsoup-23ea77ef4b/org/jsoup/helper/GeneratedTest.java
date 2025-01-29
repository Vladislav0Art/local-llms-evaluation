package org.jsoup.helper;

public class GeneratedTest {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void namespaceAware() {
        w3cdom = new org.jsoup.helper.W3CDom();
        Assertions.assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAwareFalse() {
        w3cdom = new org.jsoup.helper.W3CDom();
        Assertions.assertFalse(w3cdom.namespaceAware(false));
    }

    @Test
    public void namespaceAwarePropertiesMap() {
        Map<String, String> properties = new HashMap<>();
        properties.put("namespace", "http://example.com");
        w3cdom.propertiesFromMap(properties);
        Assertions.assertEquals("http://example.com", w3cdom.getNamespace());
    }

    @Test
    public void namespaceAwarePropertiesObject() {
        Properties properties = new Properties();
        properties.setProperty("namespace", "http://example.com");
        w3cdom.propertiesFromMap(properties);
        Assertions.assertEquals("http://example.com", w3cdom.getNamespace());
    }

    @Test
    public void namespaceAwareNullProperties() {
        w3cdom = new org.jsoup.helper.W3CDom();
        Assertions.assertFalse(w3cdom.namespaceAware(null));
    }

    @Test
    public void namespaceAwareStringProperties() {
        String[] properties = {"namespace", "http://example.com"};
        w3cdom.propertiesFromMap(Arrays.asList(properties));
        Assertions.assertEquals("http://example.com", w3cdom.getNamespace());
    }

    @Test
    public void convertDoc() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        Document convertedDoc = w3cdom.convert(doc);
        Assertions.assertEquals("<html><body>Hello World!</body></html>", convertedDoc.toString());
    }

    @Test
    public void convertElement() {
        org.jsoup.nodes.Element element = org.jsoup.nodes.Document.createElement("div");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        Document convertedDoc = w3cdom.convert(element);
        Assertions.assertEquals("<div>", convertedDoc.toString());
    }

    @Test
    public void selectXpath() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        NodeList nodeList = w3cdom.selectXpath("//div", doc);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(doc.getElementsByTagName("body"))), nodeList);
    }

    @Test
    public void selectXpathNode() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        NodeList nodeList = w3cdom.selectXpath("//div", doc);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(doc.getElementsByTagName("body"))), nodeList);
    }

    @Test
    public void sourceNodes() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        List<org.jsoup.nodes.Node> list = new org.jsoup.helper.W3CDom().sourceNodes(doc, org.jsoup.nodes.NodeType.Text);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(doc.createTextNode("Hello World!"))), list);
    }

    @Test
    public void contextNode() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        DocumentContext context = w3cdom.contextNode(doc);
        Assertions.assertEquals(doc, context.getCurrentDocument());
    }

    @Test
    public void asString() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        String result = new org.jsoup.helper.W3CDom().asString(doc);
        Assertions.assertEquals("Hello World!", result);
    }

}