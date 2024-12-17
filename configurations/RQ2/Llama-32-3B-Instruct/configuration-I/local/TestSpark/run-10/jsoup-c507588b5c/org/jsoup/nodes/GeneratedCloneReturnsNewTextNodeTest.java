package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedCloneReturnsNewTextNodeTest {

    @Test
    public void cloneReturnsNewTextNodeTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertNotNull(clone.text());
        assertEquals(node.getWholeText(), clone.getWholeText());
    }

}