package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_ReturnsFalseIfNotBlank {

    @Test
    public void isBlank_ReturnsFalseIfNotBlank() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

}