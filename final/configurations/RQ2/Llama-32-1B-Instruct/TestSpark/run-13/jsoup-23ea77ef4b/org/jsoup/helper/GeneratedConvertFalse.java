package org.jsoup.helper;

public class GeneratedConvertFalse {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void convertFalse() throws ParserConfigurationException, DOMImplementationException {
            W3CDom testW3CDom = new W3CDom();
            testW3CDom.namespaceAware(false);
            org.jsoup.nodes.Document inputDocument = factory.newDocumentBuilder().parse("path/to/input");
            org.jsoup.helper.W3CDom.convert(inputDocument, null);
        }
    }

    public static class OutputHtmlTest extends W3CDom {
        @Before
        public void init() throws ParserConfigurationException {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document document = factory.newDocumentBuilder().newDocument();
            document.documentElement.setNodeValue("<html><body>Hello World!</body></html>");
        }

    }