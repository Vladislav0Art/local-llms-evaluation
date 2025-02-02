package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_SplitOffsetIsWithinTextLength {

    @Test
    public void splitText_SplitOffsetIsWithinTextLength() {
        // Given
        TextNode textNode = new TextNode("Hello World");
        int offset = 5;

        // When
        TextNode tailNode = textNode.splitText(offset);

        // Then
        assertNotNull(tailNode);
        assertEquals("#text", tailNode.nodeName());
        assertEquals("World", tailNode.text());

        assertEquals(0, textNode.coreValue().length());
    }

}