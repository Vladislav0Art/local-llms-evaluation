package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedClone_ReturnsNewTextNode {

    @Test
    public void clone_ReturnsNewTextNode() {
        TextNode original = new TextNode("text");
        TextNode cloned = original.clone();
        assertEquals(original.nodeName(), cloned.nodeName());
        assertEquals(original.text(), cloned.text());
    }

}