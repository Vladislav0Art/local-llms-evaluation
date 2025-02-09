package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("example text");
        TextNode clone = node.clone();

        assertNotSame(node, clone);
        assertEquals(node.text(), clone.text());
    }

}