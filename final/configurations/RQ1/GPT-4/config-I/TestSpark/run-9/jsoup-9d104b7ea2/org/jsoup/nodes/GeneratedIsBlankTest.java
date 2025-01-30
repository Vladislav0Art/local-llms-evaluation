package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode tn = new TextNode("");
        assertTrue(tn.isBlank());

        tn = new TextNode("  ");
        assertTrue(tn.isBlank());

        tn = new TextNode("test");
        assertFalse(tn.isBlank());
    }

}