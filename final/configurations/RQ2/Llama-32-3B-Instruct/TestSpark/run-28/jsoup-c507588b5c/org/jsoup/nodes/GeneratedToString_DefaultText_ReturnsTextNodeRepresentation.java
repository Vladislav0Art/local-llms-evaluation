package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedToString_DefaultText_ReturnsTextNodeRepresentation {

    @Test
    public void toString_DefaultText_ReturnsTextNodeRepresentation() {
        TextNode textNode = new TextNode("Default text");
        assertEquals("<p>Default text</p>", textNode.toString());
    }

}