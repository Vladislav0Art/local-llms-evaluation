package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestSplitText_1 {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testSplitText_1() {
        // Arrange
        int offset = 3;
        String text = "Hello World";
        String expected = "World";

        // Act
        TextNode result = node.splitText(offset);

        // Assert
        assertEquals(expected, result.getText());
        verify(document).append().atOffset(3);
    }

}