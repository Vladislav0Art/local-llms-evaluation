package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedCloneTextNodeTest {

    @Test
    public void cloneTextNodeTest() {
        TextNode original = new TextNode("Hello, World!");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

}