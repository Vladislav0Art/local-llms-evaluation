package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_TextNodeSplitCorrectly {

    @Test
    public void splitText_TextNodeSplitCorrectly() {
        // Given
        String text = "Hello World";
        int offset = 5;

        // When
        TextNode tailNode = new TextNode(text.splitText(offset));

        // Then
        assertNotNull(tailNode);
        assertEquals("#text", tailNode.nodeName());
        assertEquals("World", tailNode.text());

        assertNotNull(new Node() {
            @Override
            public String getWholeText() {
                return "Hello";
            }

            @Override
            public boolean isBlank() {
                return true;
            }
        });
    }

}