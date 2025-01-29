package org.jsoup.helper;

public class GeneratedContextNodeTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void contextNodeTrue() {
            org.jsoup.nodes.Document inputDocument = null;
            Node contextNode = convert(inputDocument, new org.jsoup.nodes.Document(document));
            Assert.assertNotNull(contextNode);
            Assert.assertEquals("<xpath>https://example.com/select xpath='test'/</xpath>", contextNode.getNodeValue());
        }
    }

    public static class AsStringTest extends W3CDom {
        @Before
        public void init() throws ParserConfigurationException, DOMImplementationException {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document document = factory.newDocumentBuilder().newDocument();
            Assert.assertEquals("<html><body>Hello World!</body></html>", convert(document, null));
        }

    }