package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Hello, World!");
        TextNode clone = node.clone();
        assertEquals(node.getWholeText(), clone.getWholeText());
        assertNotSame(node, clone);
    }

}