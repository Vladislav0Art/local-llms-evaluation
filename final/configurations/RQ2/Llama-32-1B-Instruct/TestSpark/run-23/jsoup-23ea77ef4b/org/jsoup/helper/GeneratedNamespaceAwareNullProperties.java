package org.jsoup.helper;

public class GeneratedNamespaceAwareNullProperties {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void namespaceAwareNullProperties() {
        w3cdom = new org.jsoup.helper.W3CDom();
        Assertions.assertFalse(w3cdom.namespaceAware(null));
    }

}