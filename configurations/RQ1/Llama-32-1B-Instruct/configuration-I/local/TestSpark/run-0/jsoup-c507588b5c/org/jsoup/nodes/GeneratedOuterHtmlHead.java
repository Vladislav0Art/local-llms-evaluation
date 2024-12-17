package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() {
        // Arrange
        String text = "   Hello World";
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = mock(Document.class);

        when(parentNode).isBlank()).thenReturn(true);
        when(document.isOutline()).thenReturn(false);

        // Act and Assert
        TextNode result = new TextNode().outerHtmlHead(accum, 0, out);

        // Assert
        verify(accum).append("   ");
    }

}