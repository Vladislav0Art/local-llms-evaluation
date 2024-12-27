package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedClone_CloneReturnsNewTextNode {

    @Test
    public void clone_CloneReturnsNewTextNode() {
        TextNode leafNode = new TextNode("leaf");
        TextNode clonedLeafNode = leafNode.clone();
        assertTrue(clonedLeafNode != leafNode);
    }

}