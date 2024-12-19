package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedClone_returnsNewTextNode {

    @Test
    public void clone_returnsNewTextNode() {
        // [MethodUnderTest][Scenario]Test
        TextNode textNode = new TextNode("");
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertNotSame(textNode, clonedTextNode);
    }

}