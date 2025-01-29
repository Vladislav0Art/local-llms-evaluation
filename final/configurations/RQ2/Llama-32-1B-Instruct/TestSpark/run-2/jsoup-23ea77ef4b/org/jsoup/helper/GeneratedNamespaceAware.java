package org.jsoup.helper;

public class GeneratedNamespaceAware {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void namespaceAware() {
        W3CDom w3cdom = new W3CDom();
        assertTrue(w3cdom.namespaceAware());
    }

}