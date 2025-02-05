package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode clone = node.clone();
        assertFalse(node == clone);
        assertEquals(node.text(), clone.text());
    }

}