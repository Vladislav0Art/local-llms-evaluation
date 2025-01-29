package org.jsoup.helper;

public class GeneratedNamespaceAwareWithNonStandardNamespace {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAwareWithNonStandardNamespace() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(false, "http://example.com/namespace");
        Assert.assertFalse(w3cdom.namespaceAware());
    }

}