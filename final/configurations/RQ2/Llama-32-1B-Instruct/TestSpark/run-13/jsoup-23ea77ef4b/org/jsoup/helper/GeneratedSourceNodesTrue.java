package org.jsoup.helper;

public class GeneratedSourceNodesTrue {

    private DocumentBuilderFactory factory;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, DOMImplementationException {
        factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
    }

    public static class NamespaceAwareTest extends W3CDom {

        @Test
        public void sourceNodesTrue() {
            org.jsoup.nodes.Document inputDocument = null;
            org.jsoup.nodes.Document outputDocument = new org.jsoup.nodes.Document();
            List<NodeList> nodeList = sourceNodes(null, inputDocument);
            Assert.assertNotNull(nodeList);
            Assert.assertEquals(1, nodeList.size());
        }
    }

    public static class ContextNodeTest extends W3CDom {
        @Before
        public void init() throws ParserConfigurationException {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            document.appendChild(factory.newDocumentElement());
            Assert.assertEquals("<xpath>https://example.com/select xpath='test'/</xpath>", document.documentElement.getNodeValue());
        }

    }