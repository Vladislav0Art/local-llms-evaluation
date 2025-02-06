package org.jsoup.helper;

public class GeneratedFromJsoupElementReturnsDocument {

    @Test
    public void fromJsoupElementReturnsDocument() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document doc = W3CDom.fromJsoup(in);
        assertNotNull(doc);
    }

}