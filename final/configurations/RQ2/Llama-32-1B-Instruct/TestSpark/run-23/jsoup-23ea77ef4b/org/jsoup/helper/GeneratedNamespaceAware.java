package org.jsoup.helper;

public class GeneratedNamespaceAware {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void namespaceAware() {
        w3cdom = new org.jsoup.helper.W3CDom();
        Assertions.assertTrue(w3cdom.namespaceAware());
    }

}