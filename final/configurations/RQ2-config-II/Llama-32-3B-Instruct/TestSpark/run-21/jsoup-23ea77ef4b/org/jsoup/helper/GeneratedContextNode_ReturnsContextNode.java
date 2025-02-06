package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedContextNode_ReturnsContextNode {

    @Test
    public void contextNode_ReturnsContextNode() {
        // Arrange
        Document wDoc = new Document();
        Node contextNode = new Node();
        Mockito.when(W3CDom.contextNode(wDoc)).thenReturn(contextNode);
        Node result = W3CDom.contextNode(wDoc);

        // Act

        // Assert
        assert result == contextNode;
    }

}