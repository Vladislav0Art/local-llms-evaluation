package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_GivenBlankString_ReturnsTrue {

    @Test
    public void isBlank_GivenBlankString_ReturnsTrue() {
        String blankText = "";
        assertTrue(new TextNode(blankText).isBlank());
    }

}