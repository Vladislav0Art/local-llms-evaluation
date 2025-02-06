package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_stripLeadingWhitespace]

Test {

    @Test
    public void [TextNode_stripLeadingWhitespace]Test() {
        assertEquals("Hello World", TextNode.stripLeadingWhitespace("   Hello World"));
    }

}