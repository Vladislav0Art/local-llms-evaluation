package org.jsoup.helper;

public class GeneratedOutputHtmlTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void outputHtmlTrue() {
            org.jsoup.nodes.Document inputDocument = null;
            String htmlString = convert(inputDocument, null);
            Assert.assertEquals("<html><body>Hello World!</body></html>", htmlString);
        }
    }

    public static class OutputXmlTest extends W3CDom {
        @Before
        public void init() throws ParserConfigurationException {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document document = factory.newDocumentBuilder().newDocument();
            Assert.assertEquals("<html><body>Hello World!</body></html>", document.documentElement.getNodeValue());
        }

    }