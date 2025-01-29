package org.jsoup.helper;

public class GeneratedNamespaceAwareXpathNamespaceNotAwareXpath {

    private Document doc;

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

}