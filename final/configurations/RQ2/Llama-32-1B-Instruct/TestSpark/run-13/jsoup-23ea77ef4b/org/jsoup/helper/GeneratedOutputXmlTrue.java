package org.jsoup.helper;

public class GeneratedOutputXmlTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void outputXmlTrue() {
            org.jsoup.nodes.Document inputDocument = null;
            String xmlString = convert(inputDocument, null);
            Assert.assertEquals("<html><body>Hello World!</body></html>", xmlString);
        }
    }

    public static class SelectXpathTest extends W3CDom {
        @Before
        public void init() throws ParserConfigurationException {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            document.appendChild(factory.newDocumentElement());
            Assert.assertEquals("<xpath>https://example.com/select xpath='test'/</xpath>", document.documentElement.getNodeValue());
        }

    }