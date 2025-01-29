package org.jsoup.helper;

public class GeneratedNamespaceAwareUnawareNamespaceAware {

    private Document doc;

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

}