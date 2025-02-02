package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSplitText_GivenTextNodeAndOffset_ReturnsNewTextNode {

    @Mock
    private Node parentNode;

    @Test
    public void splitText_GivenTextNodeAndOffset_ReturnsNewTextNode() throws IOException {
        String text = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(offset);
        assertNotNull(tailNode.value());
        assertEquals("World", tailNode.value());
    }

}