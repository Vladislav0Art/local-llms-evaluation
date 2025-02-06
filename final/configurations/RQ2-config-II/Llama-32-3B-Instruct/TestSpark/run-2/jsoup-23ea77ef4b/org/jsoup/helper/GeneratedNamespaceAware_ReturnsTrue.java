package org.jsoup.helper;

public class GeneratedNamespaceAware_ReturnsTrue {

    @Test
    public void namespaceAware_ReturnsTrue() {
        // arrange
        W3CDom w3cdom = new W3CDom();

        // act
        boolean result = w3cdom.namespaceAware();

        // assert
        assertTrue(result);
    }

}