package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("Original node");
        TextNode clone = original.clone();
        assertNotSame(original, clone);
        assertEquals(original.text(), clone.text());
    }

}