package org.jsoup.helper;

public class GeneratedTestNamespaceAwareFalse {

    @Test
    public void testNamespaceAwareFalse() {
        org.jsoup.nodes.Document doc = new Document();
        assertFalse(org.jsoup.helper.W3CDom.namespaceAware(false));
        org.jsoup.helper.W3CDom.w3cDom(doc);
    }

}