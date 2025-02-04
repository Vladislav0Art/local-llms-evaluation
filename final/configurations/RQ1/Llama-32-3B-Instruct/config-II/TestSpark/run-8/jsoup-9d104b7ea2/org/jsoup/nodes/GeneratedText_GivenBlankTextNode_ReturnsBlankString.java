package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_GivenBlankTextNode_ReturnsBlankString {

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}