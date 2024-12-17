package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_SplitAtOffset_EmptyString_TextNode_Test {

    @Test
    public void splitText_SplitAtOffset_EmptyString_TextNode_Test() throws Exception {
        TextNode textNode = new TextNode("");
        TextNode node1 = (TextNode) mockText();
        assertEquals(node1, ((TextNode) mockText()).splitText(0));
    }

}