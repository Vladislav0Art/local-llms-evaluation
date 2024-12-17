package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedSplitTextNonEmptyText {

    @Test
    public void splitTextNonEmptyText() {
        // Arrange
        int offset = 10;
        String text = "Hello World";
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = mock(Document.class);

        when(parentNode).isBlank()).thenReturn(false);
        when(document.isOutline()).thenReturn(true);

        // Act and Assert
        TextNode result = new TextNode().splitText(offset, accum, document, out);

        // Assert
        verify(accum).append("Hello World".substring(0, offset));
    }

}