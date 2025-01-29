package org.jsoup.helper;

public class GeneratedNamespaceAwareXpathNamespaceNotAwareXpaths {

    private Document doc;

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

}