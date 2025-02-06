package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedClone_RetrunsCorrectTextNode {

    @Test
    public void clone_RetrunsCorrectTextNode() {
        String text = "Hello World";
        Document doc = new Document();
        TextNode node = doc.newTextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node.nodeName(), cloned.nodeName());
        assertEquals(node.text(), cloned.text());
    }

}