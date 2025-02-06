package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSourceNodes_ReturnsSourceNodes {

    @Test
    public void sourceNodes_ReturnsSourceNodes() {
        // Arrange
        NodeList nodeList = new NodeList();
        List<Node> expected = new ArrayList<>();
        Mockito.when(W3CDom.sourceNodes(nodeList, Node.class)).thenReturn(expected);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);

        // Act

        // Assert
        assert result == expected;
    }

}