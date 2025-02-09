package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("clone text");
        TextNode cloned = textNode.clone();
        assertNotSame(textNode, cloned);
        assertEquals(textNode.text(), cloned.text());
    }

}