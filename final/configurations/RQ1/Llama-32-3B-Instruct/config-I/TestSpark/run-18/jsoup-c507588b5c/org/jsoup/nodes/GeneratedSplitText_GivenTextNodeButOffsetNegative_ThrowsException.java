package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSplitText_GivenTextNodeButOffsetNegative_ThrowsException {

    @Mock
    private Node parentNode;

    @Test
    public void splitText_GivenTextNodeButOffsetNegative_ThrowsException() throws IOException {
        String text = "Hello World";
        int offset = -1;
        TextNode textNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

}