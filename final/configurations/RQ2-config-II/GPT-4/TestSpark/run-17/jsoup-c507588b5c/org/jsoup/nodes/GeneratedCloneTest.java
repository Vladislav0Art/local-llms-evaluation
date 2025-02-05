package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("some text");
        TextNode cloned = tn.clone();
        assertNotSame(tn, cloned);
        assertEquals(tn.text(), cloned.text());
    }

}