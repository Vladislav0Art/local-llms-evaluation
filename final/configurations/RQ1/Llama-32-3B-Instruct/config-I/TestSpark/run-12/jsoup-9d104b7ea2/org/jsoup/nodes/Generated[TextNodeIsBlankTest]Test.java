package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeIsBlankTest]

Test {

    @Test
    public void [TextNodeIsBlankTest]Test() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());

        String text2 = "   ";
        TextNode node2 = new TextNode(text2);
        assertTrue(node2.isBlank());
    }

}