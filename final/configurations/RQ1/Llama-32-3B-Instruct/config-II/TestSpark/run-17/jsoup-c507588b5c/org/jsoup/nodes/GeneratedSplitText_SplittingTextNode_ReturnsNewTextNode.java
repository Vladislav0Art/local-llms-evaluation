package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_SplittingTextNode_ReturnsNewTextNode {

    @Test
    public void splitText_SplittingTextNode_ReturnsNewTextNode() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        TextNode newTextNode = textNode.splitText(7);
        assertEquals("Hello", newTextNode.getWholeText());
    }

}