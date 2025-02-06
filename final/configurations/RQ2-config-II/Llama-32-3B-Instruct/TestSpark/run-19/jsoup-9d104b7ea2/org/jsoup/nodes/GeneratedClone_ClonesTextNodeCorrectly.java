package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedClone_ClonesTextNodeCorrectly {

    @Test
    public void clone_ClonesTextNodeCorrectly() throws Exception {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        TextNode cloned = node.clone();
        assertEquals(originalText, cloned.text());
    }

}