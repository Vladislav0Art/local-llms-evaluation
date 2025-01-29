package org.jsoup.helper;

public class GeneratedAsStringTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void asStringTrue() {
            org.jsoup.nodes.Document inputDocument = null;
            String htmlString = asString(null);
            Assert.assertEquals("<html><body>Hello World!</body></html>", htmlString);
        }
    }

}