package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedToString_GivenTextNode_ReturnsStringRepresentation {

    @Test
    public void toString_GivenTextNode_ReturnsStringRepresentation() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode.toString());
        assertEquals("text", textNode.toString().substring(0, 5));
    }

}