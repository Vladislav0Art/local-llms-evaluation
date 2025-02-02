package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[TextNodeSplitText]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [TextNodeSplitText]Test() {
        TextNode node = testNode("Hello, World!");
        TextNode result = node.splitText(6);
        assertEquals("World", result.text());
        assertTrue(node.isBlank());
    }

}