package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode clone = node.clone();
        assertNotSame("Clone Test Node is same object", node, clone);
        assertEquals("Clone Test Node has different text", node.getWholeText(), clone.getWholeText());
    }

}