package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("Hello, world!");
        TextNode clone = original.clone();

        assertNotNull(clone);
        assertEquals(original.text(), clone.text());
        assertNotSame(original, clone);
    }

}