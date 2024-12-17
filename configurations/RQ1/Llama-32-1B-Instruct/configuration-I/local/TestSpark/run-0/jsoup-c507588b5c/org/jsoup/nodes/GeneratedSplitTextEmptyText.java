package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedSplitTextEmptyText {

    @Test
    public void splitTextEmptyText() {
        // Arrange
        int offset = 10;
        String text = "";
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = mock(Document.class);

        when(parentNode).isBlank()).thenReturn(false);
        when(document.isOutline()).thenReturn(true);

        // Act
        TextNode result = new TextNode().splitText(offset, accum, document, out);

        // Assert
        verify(accum).append("");
    }

}