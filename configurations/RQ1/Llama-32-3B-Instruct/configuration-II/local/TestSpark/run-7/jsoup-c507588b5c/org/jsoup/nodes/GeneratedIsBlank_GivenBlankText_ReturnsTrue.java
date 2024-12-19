package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_GivenBlankText_ReturnsTrue {

    @Test
    public void isBlank_GivenBlankText_ReturnsTrue() {
        String rawText = "";
        TextNode textNode = new TextNode(rawText);
        assertTrue(textNode.isBlank());
    }

}