package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_GivenNonBlankString_ReturnsFalse {

    @Test
    public void isBlank_GivenNonBlankString_ReturnsFalse() {
        String nonBlankText = "test";
        assertFalse(new TextNode(nonBlankText).isBlank());
    }
}

}