package org.jsoup.helper;

public class GeneratedNamespaceAwareTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void namespaceAwareTrue() {
            W3CDom testW3CDom = new W3CDom();
            testW3CDom.namespaceAware(true);
        }

    }