package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloned = textNode.clone();
        assertNotNull(cloned);
        assertEquals(textNode.getWholeText(), cloned.getWholeText());
    }

}