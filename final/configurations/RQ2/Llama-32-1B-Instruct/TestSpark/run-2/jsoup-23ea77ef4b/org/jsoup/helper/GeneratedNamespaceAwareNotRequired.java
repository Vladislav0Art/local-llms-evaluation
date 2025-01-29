package org.jsoup.helper;

public class GeneratedNamespaceAwareNotRequired {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void namespaceAwareNotRequired() {
        W3CDom w3cdom = new W3CDom();
        assertFalse(w3cdom.namespaceAware());
    }

}