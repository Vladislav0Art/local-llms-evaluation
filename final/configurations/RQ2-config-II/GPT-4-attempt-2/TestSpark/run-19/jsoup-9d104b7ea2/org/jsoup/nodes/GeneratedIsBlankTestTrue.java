package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedIsBlankTestTrue {

    @Test
    public void isBlankTestTrue() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());
    }

}