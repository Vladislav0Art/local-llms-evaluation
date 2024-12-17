package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

public class GeneratedSplitText {

    @Test
    public void splitText() {
        // Arrange
        int offset = 10;
        String text = "Hello World";
        Appendable accum = mock(Appendable.class);
        Document document = mock(Document.class);

        when(document.isOutline()).thenReturn(true);

        // Act
        TextNode result = new TextNode().splitText(offset, accum, document, null);

        // Assert
        verify(accum).append("Hello World".substring(0, offset));
    }

}