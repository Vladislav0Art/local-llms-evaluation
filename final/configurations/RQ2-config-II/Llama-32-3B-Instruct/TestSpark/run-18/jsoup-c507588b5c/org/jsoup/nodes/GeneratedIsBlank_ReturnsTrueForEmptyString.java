package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_ReturnsTrueForEmptyString {

    @Test
    public void isBlank_ReturnsTrueForEmptyString() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}