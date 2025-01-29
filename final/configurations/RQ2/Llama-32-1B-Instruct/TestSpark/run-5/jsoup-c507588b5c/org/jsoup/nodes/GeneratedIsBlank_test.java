package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedIsBlank_test {

    @Test
    public void isBlank_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.isBlank());
    }

}