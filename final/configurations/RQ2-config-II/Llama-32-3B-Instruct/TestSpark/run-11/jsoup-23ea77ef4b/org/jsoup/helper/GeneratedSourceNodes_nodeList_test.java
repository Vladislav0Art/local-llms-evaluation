package org.jsoup.helper;

public class GeneratedSourceNodes_nodeList_test {

    @Test
    public void sourceNodes_nodeList_test() throws Exception {
        NodeList nodeList = createNodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    private Document createDocument() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setValidating(false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(new DOMSource("<html><body>Test</body></html>"));
    }

    private org.jsoup.nodes.Element createElement() {
        Element element = new org.jsoup.nodes.Element("div");
        element.attr("xml:space", "preserve");
        return element;
    }

    private NodeList createNodeList() {
        NodeList nodeList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Node node = createDocument().createTextNode("Test" + i);
            nodeList.add(node);
        }
        return nodeList;
    }

    private String propertiesToMap(String properties) {
        Properties props = W3CDom.propertiesFromMap(Collections.singletonMap("xml:space", "preserve"));
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, OutputKeys.XML);
        transformer.transform(new DOMSource(props), new StreamResult(writer));
        return writer.toString();
    }

    private Map<String, String> propertiesFromMap(Map<String, String> map) {
        Properties props = new Properties();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            props.setProperty(entry.getKey(), entry.getValue());
        }
        return props;
    }

}