package org.jsoup.helper;

public class GeneratedSelectXpathTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void selectXpathTrue() {
            org.jsoup.nodes.Document inputDocument = null;
            String xpath = "https://example.com/select xpath='test'";
            NodeList nodeList = selectXpath(xpath, inputDocument);
            Assert.assertNotNull(nodeList);
        }
    }

    public static class NodeListSourceTest extends W3CDom {
        @Before
        public void init() throws ParserConfigurationException {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            document.appendChild(factory.newDocumentElement());
            Assert.assertEquals("<xpath>https://example.com/select xpath='test'/</xpath>", document.documentElement.getNodeValue());
        }

    }