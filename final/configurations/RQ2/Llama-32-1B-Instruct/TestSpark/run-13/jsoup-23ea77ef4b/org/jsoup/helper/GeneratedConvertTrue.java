package org.jsoup.helper;

public class GeneratedConvertTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void convertTrue() {
            org.jsoup.nodes.Document inputDocument = null;
            org.jsoup.nodes.Document outputDocument = new org.jsoup.nodes.Document();
            org.jsoup.helper.W3CDom.convert(inputDocument, outputDocument);
            assert !(outputDocument instanceof Document);
        }

    }