package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestToString__ {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testToString__() {
        // Arrange
        String expected = "<TextNode>Hello World</TextNode>";

        // Act
        String result = node.toString();

        // Assert
        assertEquals(expected, result);
    }

}