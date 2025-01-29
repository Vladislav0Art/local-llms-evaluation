package org.jsoup.helper;

public class GeneratedTestNamespaceAware {

    @Test
    public void testNamespaceAware() {
        Document doc = W3CDom.createDocument();
        assertTrue(W3CDom.namespaceAware(doc));
    }

}