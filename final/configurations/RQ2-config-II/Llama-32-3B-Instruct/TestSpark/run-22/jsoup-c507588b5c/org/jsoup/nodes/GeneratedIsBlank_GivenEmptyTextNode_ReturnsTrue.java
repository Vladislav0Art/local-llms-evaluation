package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsBlank_GivenEmptyTextNode_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyTextNode_ReturnsTrue() {
        TextNode node = new TextNode();
        assertTrue(node.isBlank());
    }

}