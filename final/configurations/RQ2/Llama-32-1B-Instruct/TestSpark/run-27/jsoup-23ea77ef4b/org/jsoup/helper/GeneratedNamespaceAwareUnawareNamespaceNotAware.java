package org.jsoup.helper;

public class GeneratedNamespaceAwareUnawareNamespaceNotAware {

    private Document doc;

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

}