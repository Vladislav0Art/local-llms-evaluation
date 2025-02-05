package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("Hello, World!");
        TextNode cloned = tn.clone();
        assertNotSame(tn, cloned);
        assertEquals(tn.text(), cloned.text());
    }

}