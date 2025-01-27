package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedNewTextNode_GivenNonEmptyString_ReturnsTextNodes {

    @Test
    public void newTextNode_GivenNonEmptyString_ReturnsTextNodes() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}