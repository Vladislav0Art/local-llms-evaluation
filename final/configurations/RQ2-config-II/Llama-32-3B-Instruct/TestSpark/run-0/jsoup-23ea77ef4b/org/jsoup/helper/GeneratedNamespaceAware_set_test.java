package org.jsoup.helper;

public class GeneratedNamespaceAware_set_test {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void namespaceAware_set_test() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(false);
        assertFalse(w3cdom.namespaceAware());
    }

}