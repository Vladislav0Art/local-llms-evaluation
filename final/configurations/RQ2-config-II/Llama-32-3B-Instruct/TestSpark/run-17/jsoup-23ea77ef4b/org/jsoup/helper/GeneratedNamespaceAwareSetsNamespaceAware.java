package org.jsoup.helper;

public class GeneratedNamespaceAwareSetsNamespaceAware {

    @Test
    public void namespaceAwareSetsNamespaceAware() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());
    }

}