package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNamespaceAware_TurnsNamespaceAwareOn {

    @Test
    public void namespaceAware_TurnsNamespaceAwareOn() {
        // Arrange
        boolean expected = false;
        W3CDom w3cDom = new W3CDom();
        Mockito.when(w3cDom.namespaceImplementation()).thenReturn(expected);
        w3cDom.namespaceAware(true);

        // Act
        assert !w3cDom.namespaceAware();

        // Assert
        assert expected;
    }

}