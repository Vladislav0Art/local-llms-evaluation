package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneMethodReturnsNewInstanceForNonBlankTextNode {

    @Test
    public void cloneMethodReturnsNewInstanceForNonBlankTextNode() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = node.clone();
        assertNotEquals(node, clonedNode);
    }

}