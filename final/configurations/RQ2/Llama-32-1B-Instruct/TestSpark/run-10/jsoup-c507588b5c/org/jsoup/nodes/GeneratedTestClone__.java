package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestClone__ {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testClone__() {
        // Arrange
        TextNode result = new TextNode("Hello World");
        when(node.clone()).thenReturn(result);

        // Act
        TextNode actual = (TextNode) node.clone();

        // Assert
        assertEquals(actual, result);
    }

}