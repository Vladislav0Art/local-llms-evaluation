package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneCreatesNewTextNode {

    @Test
    public void cloneCreatesNewTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertNotNull(clone.text());
        assertTrue(!clone.equals(node));
    }

}