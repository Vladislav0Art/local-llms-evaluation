package org.jsoup.helper;

public class GeneratedNamespaceAwareFalse {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void namespaceAwareFalse() {
        w3cdom = new org.jsoup.helper.W3CDom();
        Assertions.assertFalse(w3cdom.namespaceAware(false));
    }

}