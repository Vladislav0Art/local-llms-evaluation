package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_MockitoMocking_ReturnsCorrectTextNode {

    @Test
    public void splitText_MockitoMocking_ReturnsCorrectTextNode() throws IOException {
        // Arrange and Act
        MockableParentNode parentNode = mock(MockableParentNode.class);
        TextNode textNode = new TextNode("Hello World");
        when(parentNode.addChildren()).thenReturn(1);
        String encodedText = "&lt;Test&gt;";
        TextNode result = textNode.splitText(3, parentNode);
        assertEquals("World", result.text());
    }
}

}