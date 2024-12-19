package org.jsoup.helper;

public class GeneratedNamespaceAware {

    private org.jsoup.nodes.Document document;

    @Test
    public void namespaceAware() {
        document = org.jsoup.select.Document.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertFalse(W3CDom.namespaceAware());
        assertTrue(W3CDom.namespaceAware(true));
    }

}