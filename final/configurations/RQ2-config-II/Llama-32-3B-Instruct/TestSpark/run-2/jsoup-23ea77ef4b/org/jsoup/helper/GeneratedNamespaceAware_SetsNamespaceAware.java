package org.jsoup.helper;

public class GeneratedNamespaceAware_SetsNamespaceAware {

    @Test
    public void namespaceAware_SetsNamespaceAware() {
        // arrange
        W3CDom w3cdom = new W3CDom();
        boolean namespaceAware = true;

        // act
        w3cdom.namespaceAware(namespaceAware);

        // assert
        assertTrue(w3cdom.namespaceAware());
    }

}