package org.jsoup.helper;

public class GeneratedContextNode {

    private org.jsoup.nodes.Document document;

    @Test
    public void contextNode() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        W3CDom.contextNode(document, null);
        org.jsoup.nodes.Document wDoc = new org.jsoup.select.Document();
        assertEquals(document, W3CDom.fromJsoup(wDoc));
    }

}