package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest_Blank {

    @Test
    public void isBlankTest_Blank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}