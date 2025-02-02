package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSplitText_GivenTextNodeButOffsetGreaterThanLength_ReturnsSameTextNode {

    @Mock
    private Node parentNode;

    @Test
    public void splitText_GivenTextNodeButOffsetGreaterThanLength_ReturnsSameTextNode() throws IOException {
        String text = "Hello World";
        int offset = 10;
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(text, tailNode.value());
    }

}