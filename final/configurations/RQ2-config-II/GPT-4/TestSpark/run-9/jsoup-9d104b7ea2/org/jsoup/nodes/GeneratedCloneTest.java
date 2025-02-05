package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test text");
        TextNode cloneNode = node.clone();

        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}