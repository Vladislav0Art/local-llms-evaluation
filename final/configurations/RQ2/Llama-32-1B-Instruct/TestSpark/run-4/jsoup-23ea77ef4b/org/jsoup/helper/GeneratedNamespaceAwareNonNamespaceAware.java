package org.jsoup.helper;

public class GeneratedNamespaceAwareNonNamespaceAware {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAwareNonNamespaceAware() {
        W3CDom w3cdom = new W3CDom();
        Assert.assertFalse(w3cdom.namespaceAware());
        Assert.assertFalse(w3cdom.namespaceAware(true));
    }

}