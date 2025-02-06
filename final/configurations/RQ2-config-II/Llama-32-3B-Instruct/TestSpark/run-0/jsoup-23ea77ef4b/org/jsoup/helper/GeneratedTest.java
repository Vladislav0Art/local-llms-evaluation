package org.jsoup.helper;

public class GeneratedTest {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cdom = new W3CDom();
        assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAware_set_test() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(false);
        assertFalse(w3cdom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document expectedDoc = DOC;
        assertEquals(expectedDoc, W3CDom.convert(doc));
    }

    @Test
    public void asStringDocument_test() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument(null, null, null);
        Map<String, String> properties = new HashMap<>();
        StringWriter sw = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer(new DOMSource(doc), new StreamResult(sw));
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(doc), new StreamResult(sw));
        assertEquals("test", W3CDom.asString(doc, properties).trim());
    }

    @Test
    public void fromJsoupDocument_test() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document();
        Document expectedDoc = DOC;
        Document actualDoc = W3CDom.fromJsoup(jsoupDoc);
        assertEquals(expectedDoc, actualDoc);
    }

    @Test
    public void selectXpathDocument_test() {
        NodeList nodeList = DOC.getElementsByTagName("test");
        NodeList expectedNodeList = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            org.w3c.dom.Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                expectedNodeList.add((org.w3c.dom.Element) node);
            }
        }
        NodeList actualNodeList = W3CDom.selectXpath("test", DOC);
        assertEquals(expectedNodeList, actualNodeList);
    }

    @Test
    public void fromJsoupElement_test() {
        org.jsoup.nodes.Element jsoupElement = new org.jsoup.nodes.Element();
        Document expectedDoc = DOC;
        Document actualDoc = W3CDom.fromJsoup(jsoupElement);
        assertEquals(expectedDoc, actualDoc);
    }

}