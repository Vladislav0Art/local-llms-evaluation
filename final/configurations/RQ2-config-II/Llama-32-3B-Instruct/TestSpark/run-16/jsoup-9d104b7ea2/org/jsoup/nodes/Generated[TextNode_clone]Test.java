package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_clone]

Test {

    @Test
    public void [TextNode_clone]Test() throws IOException {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.text(), clonedTextNode.text());
    }

}