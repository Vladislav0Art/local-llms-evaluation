package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedClone_AnnotatedTextNodes_ReturnSameInstance {

    @Test
    public void clone_AnnotatedTextNodes_ReturnSameInstance() throws Exception {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = node1.clone();
        assertTrue(node1.equals(node2));
    }

}