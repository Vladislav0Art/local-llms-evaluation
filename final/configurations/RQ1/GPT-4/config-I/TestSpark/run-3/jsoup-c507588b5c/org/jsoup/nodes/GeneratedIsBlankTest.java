package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode tn1 = new TextNode("  ");
        assertTrue(tn1.isBlank());
        TextNode tn2 = new TextNode("test");
        assertFalse(tn2.isBlank());
    }

}