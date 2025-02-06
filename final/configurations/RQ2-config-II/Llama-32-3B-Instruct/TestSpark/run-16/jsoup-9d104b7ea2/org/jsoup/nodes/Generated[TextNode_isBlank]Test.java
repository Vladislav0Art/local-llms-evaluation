package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_isBlank]

Test {

    @Test
    public void [TextNode_isBlank]Test() {
        TextNode blankTextNode = new TextNode("");
        assertTrue(blankTextNode.isBlank());
        TextNode nonBlankTextNode = new TextNode("Hello World");
        assertFalse(nonBlankTextNode.isBlank());
    }

}