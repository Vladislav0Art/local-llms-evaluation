package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneCreatesCopy {

    @Test
    public void cloneCreatesCopy() {
        TextNode original = new TextNode("Original Text");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

}