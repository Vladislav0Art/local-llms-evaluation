package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_normaliseWhitespace]

Test {

    @Test
    public void [TextNode_normaliseWhitespace]Test() {
        assertEquals("   ", TextNode.normaliseWhitespace("\t\r\n  "));
    }

}