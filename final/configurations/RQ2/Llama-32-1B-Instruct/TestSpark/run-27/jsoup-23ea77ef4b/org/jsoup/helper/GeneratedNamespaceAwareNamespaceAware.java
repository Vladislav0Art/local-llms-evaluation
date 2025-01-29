package org.jsoup.helper;

public class GeneratedNamespaceAwareNamespaceAware {

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

}