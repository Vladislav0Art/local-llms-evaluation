package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNamespaceAware_ReturnsTrue {

    @Test
    public void namespaceAware_ReturnsTrue() {
        // Arrange
        boolean expected = true;
        Mockito.when(W3CDom.namespaceImplementation()).thenReturn(expected);
        boolean result = W3CDom.namespaceAware();

        // Act
        assert result == expected;
    }

}