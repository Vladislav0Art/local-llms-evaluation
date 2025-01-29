package org.jsoup.helper;

public class GeneratedNamespaceAwareFalse {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void namespaceAwareFalse() {
            W3CDom testW3CDom = new W3CDom();
            assert !testW3CDom.namespaceAware(false);
        }
    }

}