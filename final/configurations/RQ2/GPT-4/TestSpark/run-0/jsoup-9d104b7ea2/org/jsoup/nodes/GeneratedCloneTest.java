package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test Text");
        TextNode cloneNode = node.clone();
        assertNotSame(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}