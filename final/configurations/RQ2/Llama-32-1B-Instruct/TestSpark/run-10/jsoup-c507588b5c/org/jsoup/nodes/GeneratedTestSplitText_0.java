package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestSplitText_0 {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testSplitText_0() {
        // Arrange
        int offset = 0;
        String text = "Hello World";
        String expected = "Hello";

        // Act
        TextNode result = node.splitText(offset);

        // Assert
        assertEquals(expected, result.getText());
        verify(document).append().atOffset(0);
    }

}