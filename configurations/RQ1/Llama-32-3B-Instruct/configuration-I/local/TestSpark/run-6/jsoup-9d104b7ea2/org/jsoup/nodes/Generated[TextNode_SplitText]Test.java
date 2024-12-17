package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNode_SplitText]

Test {

    @Test
    public void [TextNode_SplitText]Test() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        int offset = 3;
        TextNode tailNode = textNode.splitText(offset);
        assertNotNull(tailNode);
        assertEquals(4, tailNode.text().length());
    }

}