package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneMethodReturnsSameInstanceForBlankTextNode {

    @Test
    public void cloneMethodReturnsSameInstanceForBlankTextNode() {
        TextNode node = new TextNode("");
        TextNode clonedNode = node.clone();
        assertEquals(node, clonedNode);
    }

}