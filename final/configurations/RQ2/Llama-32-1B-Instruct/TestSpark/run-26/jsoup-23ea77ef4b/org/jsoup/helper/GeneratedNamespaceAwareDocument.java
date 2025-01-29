package org.jsoup.helper;

public class GeneratedNamespaceAwareDocument {

    @Test
    public void namespaceAwareDocument() throws Exception {
        Document doc = org.jsoup.helper.W3CDom.convert(org.jsoup.nodes.DocumentFactory.newInstance().create(doc));
        System.out.println(W3CDom.namespaceAware());
    }

}