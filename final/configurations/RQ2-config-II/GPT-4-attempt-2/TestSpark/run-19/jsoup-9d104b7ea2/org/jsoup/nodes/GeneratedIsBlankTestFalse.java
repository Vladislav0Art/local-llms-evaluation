package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedIsBlankTestFalse {

    @Test
    public void isBlankTestFalse() {
        TextNode node = new TextNode("not blank");
        assertFalse(node.isBlank());
    }

}