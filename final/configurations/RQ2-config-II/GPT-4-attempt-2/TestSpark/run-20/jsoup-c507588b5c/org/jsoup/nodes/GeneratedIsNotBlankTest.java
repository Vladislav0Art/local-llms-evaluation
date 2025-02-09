package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsNotBlankTest {

    @Test
    public void isNotBlankTest() {
        TextNode node = new TextNode("content");
        assertFalse(node.isBlank());
    }

}