package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_GivenTextNode_GivenOffset_ReturnsNewTextNode {

    @Test
    public void splitText_GivenTextNode_GivenOffset_ReturnsNewTextNode() throws IOException {
        String text = "Hello\nWorld";
        int offset = 5;
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
    }

}