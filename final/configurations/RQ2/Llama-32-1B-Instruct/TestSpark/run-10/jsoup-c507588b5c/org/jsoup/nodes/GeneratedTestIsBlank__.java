package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestIsBlank__ {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testIsBlank__() {
        // Arrange
        boolean expected = false;
        String actual = node.isBlank();

        // Act
        Boolean result = actual;

        // Assert
        assertEquals(expected, result);
    }

}