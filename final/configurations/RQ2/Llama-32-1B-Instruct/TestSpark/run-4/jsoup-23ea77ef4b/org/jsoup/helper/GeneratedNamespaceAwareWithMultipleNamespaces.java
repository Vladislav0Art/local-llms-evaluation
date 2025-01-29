package org.jsoup.helper;

public class GeneratedNamespaceAwareWithMultipleNamespaces {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAwareWithMultipleNamespaces() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware("http://example.com", "http://example.net");
        Assert.assertTrue(w3cdom.namespaceAware());
    }

}