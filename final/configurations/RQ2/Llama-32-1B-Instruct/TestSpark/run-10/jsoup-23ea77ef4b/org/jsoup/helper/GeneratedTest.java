package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void namespaceAware_MultipleMethodsTest() throws Exception {
        // Given
        org.jsoup.nodes.Document doc = new Document();

        // When
        boolean result1 = W3CDom.namespaceAware();
        boolean result2 = W3CDom.namespaceAware(true);

        // Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }

    @Test
    public void namespaceAware_MultiplePropertiesMapTest() throws Exception {
        Properties props = new Properties();

        String[] properties = {"key1", "value1"};
        props.put("key2", "value2");
        doc.setProperty("property1", "value1");
        doc.setProperty("property2", "value2");

        boolean result1 = W3CDom.namespaceAware(true, props);
        boolean result2 = W3CDom.namespaceAware();

        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }

    @Test
    public void namespaceAware_OutputHtmlTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        // Given
        String[] properties = {"key1", "value1"};
        Properties props = new Properties();
        props.put("property1", "value1");
        doc.setProperty("property2", "value2");

        // When
        W3CDom.OutputHtml(doc, props);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

    @Test
    public void namespaceAware_OutputXmlTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        // Given
        String[] properties = {"key1", "value1"};
        Properties props = new Properties();
        props.put("property1", "value1");
        doc.setProperty("property2", "value2");

        W3CDom.OutputXml(doc, props);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_xml"));
    }

    @Test
    public void namespaceAware_FromJsoup_MultipleMethodsTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        org.jsoup.nodes.Element element = new Document();
        element.setAttribute("key", "value");
        element.setAttribute("otherKey", "otherValue");

        // Given
        String[] properties = {"property1", "value1"};
        Properties props = new Properties();
        props.put("property2", "value2");

        doc.setProperty("contextNode", element);
        W3CDom.sourceNodes(doc, org.jsoup.nodes.Node.class);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

    @Test
    public void namespaceAware_FromJsoupContextNodeTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        org.jsoup.nodes.Element element = new Document();
        element.setAttribute("key", "value");
        element.setAttribute("otherKey", "otherValue");

        // Given
        Node contextNode = new Document();
        contextNode.appendChild(element);

        // When
        W3CDom.contextNode(doc, contextNode);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

    @Test
    public void namespaceAware_FromJsoupStringToStringTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        String documentString = "<root><element1>value1</element1></root>";

        // Given
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        String htmlString = transformer.transform(new InputSource(new java.io.StringReader(documentString)), new javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder())
                .getOutput().toString();

        // When
        W3CDom.OutputHtml(doc, null);

        // Then
        Assert.assertTrue(htmlString.contains("<html><body>"));
    }

}