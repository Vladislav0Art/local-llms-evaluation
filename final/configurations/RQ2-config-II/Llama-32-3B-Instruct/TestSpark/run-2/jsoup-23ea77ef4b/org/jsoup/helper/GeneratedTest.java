package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void namespaceAware_ReturnsTrue() {
        // arrange
        W3CDom w3cdom = new W3CDom();

        // act
        boolean result = w3cdom.namespaceAware();

        // assert
        assertTrue(result);
    }

    @Test
    public void namespaceAware_SetsNamespaceAware() {
        // arrange
        W3CDom w3cdom = new W3CDom();
        boolean namespaceAware = true;

        // act
        w3cdom.namespaceAware(namespaceAware);

        // assert
        assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void convert_ConvertsJsoupDocumentToW3CDom() {
        // arrange
        Document in = new org.w3c.dom.Document();
        Document expected = new org.w3c.dom.Document();

        // act
        Document w3cdom = W3CDom.convert(in);

        // assert
        assertEquals(expected, w3cdom);
    }

    @Test
    public void asString_ConvertsW3CDomToHtml() {
        // arrange
        Document doc = new org.w3c.dom.Document();
        Map<String, String> properties = new HashMap<>();

        // act
        String result = W3CDom.asString(doc, properties);

        // assert
        assertNotNull(result);
    }

    @Test
    public void OutputHtml_ReturnsOutput() {
        // arrange
        Properties expected = new Properties();

        // act
        Map<String, String> output = W3CDom.OutputHtml();

        // assert
        assertEquals(expected, output);
    }

    @Test
    public void fromJsoup_ConvertsJsoupDocumentToW3CDom() {
        // arrange
        Document in = new org.jsoup.nodes.Document();
        Document expected = new org.w3c.dom.Document();

        // act
        Document w3cdom = W3CDom.fromJsoup(in);

        // assert
        assertEquals(expected, w3cdom);
    }

    @Test
    public void fromJsoup_ConvertsJsoupElementToW3CElement() {
        // arrange
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document expected = new org.w3c.dom.Document();

        // act
        Document w3cdom = W3CDom.fromJsoup(in);

        // assert
        assertEquals(expected, w3cdom);
    }

    @Test
    public void convert_ConvertsW3CDomToJsoupDocument() {
        // arrange
        Document in = new org.w3c.dom.Document();
        Document expected = new org.jsoup.nodes.Document();

        // act
        Document result = W3CDom.convert(expected);

        // assert
        assertEquals(in, result);
    }

    @Test
    public void convert_ConvertsW3CElementToJsoupElement() {
        // arrange
        org.w3c.dom.Element in = new org.w3c.dom.Element();
        org.jsoup.nodes.Element expected = new org.jsoup.nodes.Element();

        // act
        org.jsoup.nodes.Element result = W3CDom.convert(expected);

        // assert
        assertEquals(in, result);
    }

    @Test
    public void selectXpath_ConvertsW3CNodeListToJsoupNodes() {
        // arrange
        NodeList nodeList = new org.w3c.dom.NodeList();
        Class<T> nodeType = Class.forName("org.jsoup.nodes.Node");

        // act
        List<Node> result = W3CDom.sourceNodes(nodeList, nodeType);

        // assert
        assertTrue(result.isEmpty());
    }

    @Test
    public void contextNode_ReturnsContextNode() {
        // arrange
        Document wDoc = new org.w3c.dom.Document();

        // act
        Node result = W3CDom.contextNode(wDoc);

        // assert
        assertNotNull(result);
    }

    @Test
    public void asString_ConvertsW3CDomToHtmlString() {
        // arrange
        Document doc = new org.w3c.dom.Document();
        Map<String, String> properties = new HashMap<>();

        // act
        String result = W3CDom.asString(doc, properties);

        // assert
        assertNotNull(result);
    }

}