package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        // Arrange
        String text = "   Hello World";
        Appendable parent = mock(Appendable.class);
        Document document = mock(Document.class);

        when(parent.isBlank()).thenReturn(true);

        // Act and Assert
        assertTrue(TextNode.isBlank(text));
    }

}