package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_MockOffset {

    @Test
    public void splitText_MockOffset() throws IOException {
        String text = "Hello World";
        int offset = 5;
        when(splitText(offset)).thenReturn("Hello", "");
        TextNode node = new TextNode(text);
        assertEquals("Hello", node.splitText(offset));
    }

}