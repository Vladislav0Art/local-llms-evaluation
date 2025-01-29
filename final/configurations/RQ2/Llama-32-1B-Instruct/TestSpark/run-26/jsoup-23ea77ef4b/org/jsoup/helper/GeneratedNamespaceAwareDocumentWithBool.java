package org.jsoup.helper;

public class GeneratedNamespaceAwareDocumentWithBool {

    @Test
    public void namespaceAwareDocumentWithBool() throws Exception {
        Document doc = org.jsoup.helper.W3CDom.convert(org.jsoup.nodes.DocumentFactory.newInstance().create(doc, new Properties()));
        W3CDom.W3CDom namespaceAware = new org.jsoup.helper.W3CDom();
        System.out.println(namespaceAware.namespaceAware(true));
    }

}