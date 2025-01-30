package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedCloneTest {


    // Test for normaliseWhitespace()

    @Test
    public void cloneTest() {
        TextNode textNode1 = new TextNode("This is a text");
        TextNode textNode2 = textNode1.clone();
        assertEquals(textNode1.text(), textNode2.text());
    }

}