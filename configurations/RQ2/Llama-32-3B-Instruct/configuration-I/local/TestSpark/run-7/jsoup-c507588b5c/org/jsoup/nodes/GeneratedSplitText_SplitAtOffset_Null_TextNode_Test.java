package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_SplitAtOffset_Null_TextNode_Test {

    @Test
    public void splitText_SplitAtOffset_Null_TextNode_Test() throws Exception {
        TextNode textNode = new TextNode(null);
        TextNode node1 = (TextNode) mockText();
        assertEquals(null, ((TextNode) mockText()).splitText(0));
    }

}