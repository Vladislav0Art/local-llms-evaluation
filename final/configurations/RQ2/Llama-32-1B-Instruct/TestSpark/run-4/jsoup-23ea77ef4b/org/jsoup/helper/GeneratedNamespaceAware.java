package org.jsoup.helper;

public class GeneratedNamespaceAware {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAware() {
        W3CDom w3cdom = new W3CDom();
        assert w3cdom.namespaceAware();
    }

}