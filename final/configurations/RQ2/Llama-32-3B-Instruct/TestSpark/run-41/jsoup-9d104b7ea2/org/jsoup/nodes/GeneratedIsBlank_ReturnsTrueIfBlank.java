package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_ReturnsTrueIfBlank {

    @Test
    public void isBlank_ReturnsTrueIfBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}