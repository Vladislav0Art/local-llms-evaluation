package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsBlank_GivenTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenTextNode_ReturnsFalse() {
        TextNode node = new TextNode("");
        assertFalse(node.isBlank());
    }

}