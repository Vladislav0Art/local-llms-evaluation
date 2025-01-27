package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedIsBlank_GivenTextNodeWithBlankText_ReturnsTrue {

    @Test
    public void isBlank_GivenTextNodeWithBlankText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    public static class IOException extends Exception {
    }

}