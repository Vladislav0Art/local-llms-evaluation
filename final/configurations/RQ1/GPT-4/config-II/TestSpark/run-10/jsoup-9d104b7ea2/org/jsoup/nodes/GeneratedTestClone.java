package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode clonedNode = textNode.clone();

        assertNotSame(textNode, clonedNode);
        assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}