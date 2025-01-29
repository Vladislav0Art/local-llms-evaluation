package org.jsoup.helper;

public class GeneratedNamespaceAwareWithNullStringAsNamespace {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAwareWithNullStringAsNamespace() {
        W3CDom w3cdom = new W3CDom();
        Assert.assertFalse(w3cdom.namespaceAware(null, ""));
    }

}