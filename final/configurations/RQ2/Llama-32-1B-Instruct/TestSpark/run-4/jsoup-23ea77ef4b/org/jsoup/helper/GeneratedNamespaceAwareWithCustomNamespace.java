package org.jsoup.helper;

public class GeneratedNamespaceAwareWithCustomNamespace {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAwareWithCustomNamespace() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(true, "http://example.com");
        Assert.assertTrue(w3cdom.namespaceAware());
    }

}