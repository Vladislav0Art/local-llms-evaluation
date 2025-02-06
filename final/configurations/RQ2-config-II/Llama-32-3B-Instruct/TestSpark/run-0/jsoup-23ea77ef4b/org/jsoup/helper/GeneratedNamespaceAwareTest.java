package org.jsoup.helper;

public class GeneratedNamespaceAwareTest {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cdom = new W3CDom();
        assertTrue(w3cdom.namespaceAware());
    }

}