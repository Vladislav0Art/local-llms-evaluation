package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedIsBlankTrueTest {

    @Test
    public void isBlankTrueTest() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());
    }

}