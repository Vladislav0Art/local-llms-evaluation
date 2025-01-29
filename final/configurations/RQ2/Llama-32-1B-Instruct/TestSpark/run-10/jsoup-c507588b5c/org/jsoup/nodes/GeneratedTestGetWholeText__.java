package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestGetWholeText__ {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testGetWholeText__() {
        // Arrange
        String text = "Hello World";
        String expected = "Hello World";

        // Act
        String result = node.getWholeText();

        // Assert
        assertEquals(expected, result);
    }

}