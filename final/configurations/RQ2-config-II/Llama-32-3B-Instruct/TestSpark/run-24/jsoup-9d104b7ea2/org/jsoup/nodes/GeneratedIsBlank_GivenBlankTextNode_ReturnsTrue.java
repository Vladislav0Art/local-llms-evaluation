package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_GivenBlankTextNode_ReturnsTrue {

    @Test
    public void isBlank_GivenBlankTextNode_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}