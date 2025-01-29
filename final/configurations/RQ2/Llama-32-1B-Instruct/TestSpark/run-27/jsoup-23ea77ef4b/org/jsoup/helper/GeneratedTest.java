package org.jsoup.helper;

public class GeneratedTest {

    private Document doc;

    @Test
    public void namespaceAwareNamespaceAware() {
        Properties properties = new HashMap<>();
        properties.put("ns", "http://example.com");
        W3CDom w3cDom = new W3CDom();
        assertEquals(true, w3cDom.namespaceAware(true));
        assertEquals(false, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());
    }

    @Test
    public void namespaceAwareUnawareNamespaceAware() {
        Properties properties = new HashMap<>();
        W3CDom w3cDom = new W3CDom();
        assertEquals(false, w3cDom.namespaceAware(true));
        assertEquals(true, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());
    }

    @Test
    public void namespaceAwareUnawareNamespaceNotAware() {
        Properties properties = new HashMap<>();
        Properties un awareProperties = new HashMap<>();
        un awareProperties.put("ns", "http://example.com");
        W3CDom w3cDom = new W3CDom();
        assertEquals(false, w3cDom.namespaceAware(true));
        assertEquals(true, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());
    }

    @Test
    public void namespaceAwareUnawareNamespaceNotAwareXpath() {
        Properties properties = new HashMap<>();
        Properties un awareProperties = new HashMap<>();
        un awareProperties.put("ns", "http://example.com");
        W3CDom w3cDom = new W3CDom();
        assertEquals(false, w3cDom.namespaceAware(true));
        assertEquals(true, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());

        Document doc = createDocument("http://example.com");
        W3CDom.w3cDom = new W3CDom(doc);
        assertTrue(W3CDom.w3cDom.namespaceAware(true));
    }

    @Test
    public void namespaceAwareXpathNamespaceNotAware() {
        Properties properties = new HashMap<>();
        Properties un awareProperties = new HashMap<>();
        un awareProperties.put("ns", "http://example.com");
        W3CDom w3cDom = new W3CDom();
        assertEquals(false, w3cDom.namespaceAware(true));
        assertEquals(true, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());
    }

    @Test
    public void namespaceAwareXpathNamespaceNotAwareXpath() {
        Properties properties = new HashMap<>();
        Properties un awareProperties = new HashMap<>();
        un awareProperties.put("ns", "http://example.com");
        W3CDom w3cDom = new W3CDom();
        assertEquals(false, w3cDom.namespaceAware(true));
        assertEquals(true, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());

        Document doc = createDocument("http://example.com");
        W3CDom.w3cDom = new W3CDom(doc);
        assertTrue(W3CDom.w3cDom.namespaceAware(true));

        NodeList xpathNodes = selectXpath("ns:element", doc);
        assertEquals(1, xpathNodes.getLength());
    }

    @Test
    public void namespaceAwareXpathNamespaceNotAwareXpaths() {
        Properties properties = new HashMap<>();
        Properties un awareProperties = new HashMap<>();
        un awareProperties.put("ns", "http://example.com");
        W3CDom w3cDom = new W3CDom();
        assertEquals(false, w3cDom.namespaceAware(true));
        assertEquals(true, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());

        NodeList xpathNodes1 = selectXpath("ns:element", doc);
        assertTrue(xpathNodes1.getLength() == 0);

        NodeList xpathNodes2 = selectXpath("ns:anotherElement", doc);
        assertEquals(1, xpathNodes2.getLength());
    }

    @Test
    public void namespaceAwareXpathsNamespaceNotAwareXpaths() {
        Properties properties = new HashMap<>();
        Properties un awareProperties = new HashMap<>();
        un awareProperties.put("ns", "http://example.com");
        W3CDom w3cDom = new W3CDom();
        assertEquals(false, w3cDom.namespaceAware(true));
        assertEquals(true, w3cDom.namespaceAware(false));

        String propertiesString = properties.toString();
        Properties fromMap = W3CDom.propertiesFromMap(properties);
        assertEquals(propertiesString, fromMap.toString());

        NodeList xpathNodes1 = selectXpath("ns:element", doc);
        assertTrue(xpathNodes1.getLength() == 0);

        NodeList xpathNodes2 = selectXpath("ns:anotherElement", doc);
        assertEquals(1, xpathNodes2.getLength());
    }

    private Document createDocument(String url) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(new java.io.StringReader(url));
        } catch (ParserConfigurationException | Exception e) {
            throw new RuntimeException(e);
        }
    }

}