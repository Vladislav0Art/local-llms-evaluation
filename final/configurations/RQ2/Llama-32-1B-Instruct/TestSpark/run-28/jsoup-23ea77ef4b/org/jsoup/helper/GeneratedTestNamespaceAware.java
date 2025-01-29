package org.jsoup.helper;

public class GeneratedTestNamespaceAware {

    @Test
    public void testNamespaceAware() {
        org.jsoup.nodes.Document doc = new Document();
        assertTrue(org.jsoup.helper.W3CDom.namespaceAware(true));
        org.jsoup.helper.W3CDom.w3cDom(doc);
    }

}