package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewTextNode_GivenRawText_ReturnsCorrectTextNode {

    @Test
    public void newTextNode_GivenRawText_ReturnsCorrectTextNode() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertEquals(rawText, textNode.text());
    }

}