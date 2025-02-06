package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneCreatesNewTextNodeWithSameContent {

    @Test
    public void cloneCreatesNewTextNodeWithSameContent() {
        String text = "initial";
        TextNode original = new TextNode(text);
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

}