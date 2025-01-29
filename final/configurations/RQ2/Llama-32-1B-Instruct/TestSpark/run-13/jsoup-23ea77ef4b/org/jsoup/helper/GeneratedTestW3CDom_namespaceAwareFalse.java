package org.jsoup.helper;

public class GeneratedTestW3CDom_namespaceAwareFalse {

    public static Document namespaceAwareTrue() throws Exception {
        return factory.newDocumentBuilder().parse("path/to/input");
    }

    @Test
    public void testW3CDom_namespaceAwareFalse() throws Exception {
        Document inputDocument = namespaceAwareFalse();
        org.jsoup.nodes.Document outputDocument = new org.jsoup.nodes.Document();
        org.jsoup.helper.W3CDom.convert(inputDocument, outputDocument);
        assert !(outputDocument instanceof Document);
    }

}