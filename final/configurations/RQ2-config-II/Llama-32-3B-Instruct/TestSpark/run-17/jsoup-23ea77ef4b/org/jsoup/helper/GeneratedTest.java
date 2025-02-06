package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void namespaceAwareReturnsTrue() {
        boolean result = org.jsoup.helper.W3CDom.namespaceAware();
        assertTrue(result);
    }

    @Test
    public void namespaceAwareSetsNamespaceAware() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void convertDocumentReturnsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document doc = W3CDom.convert(in);
        assertNotNull(doc);
    }

    @Test
    public void asStringDocumentWithPropertiesReturnsString() {
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document();
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "html");
        assertEquals("html", W3CDom.asString(doc, properties));
    }

    @Test
    public void propertiesFromMapReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

    @Test
    public void OutputHtmlReturnsHashMap() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void OutputXmlReturnsHashMap() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void fromJsoupDocumentReturnsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document doc = W3CDom.fromJsoup(in);
        assertNotNull(doc);
    }

    @Test
    public void fromJsoupElementReturnsDocument() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document doc = W3CDom.fromJsoup(in);
        assertNotNull(doc);
    }

    @Test
    public void convertDocumentWithDocumentReturnsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document out = new Document();
        W3CDom.convert(in, out);
        assertEquals(1, out.getDocument().getDocumentElement().getNodeType());
    }

    @Test
    public void convertElementWithElementReturnsDocument() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Element out = new Element();
        W3CDom.convert(in, out);
        assertEquals(1, out.get NodeType());
    }

    @Test
    public void selectXpathStringWithDocumentReturnsNodeList() {
        Document doc = new Document();
        NodeList nodeList = W3CDom.selectXpath("/root", doc);
        assertTrue(nodeList.size() > 0);
    }

    @Test
    public void selectXpathStringWithNodeReturnsNodeList() {
        Node contextNode = new Node();
        NodeList nodeList = W3CDom.selectXpath("/root", contextNode);
        assertTrue(nodeList.size() > 0);
    }

    @Test
    public void sourceNodesNodeListWithNodeTypeReturnsList() {
        NodeList nodeList = new NodeList();
        List<Node> list = W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(list.size() == 1);
    }

    @Test
    public void contextNodeDocumentReturnsNode() {
        Document wDoc = new Document();
        Node result = W3CDom.contextNode(wDoc);
        assertNotNull(result);
    }

    @Test
    public void asStringDocumentReturnsString() {
        Document doc = new Document();
        String result = W3CDom.asString(doc);
        assertEquals("root", result);
    }

}