package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_GivenTextNode_ReturnsUnencodedText {

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello World ");
        assertEquals("Hello World ", textNode.text());
    }

}