package org.jsoup.helper;

public class GeneratedTestNamespaceAware_not {

    @Test
    public void testNamespaceAware_not() {
        Document doc = W3CDom.createDocument(false);
        assertFalse(W3CDom.namespaceAware(doc));
    }

}