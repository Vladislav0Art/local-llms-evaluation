package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedCreateTextNode_givenText_ReturnsTextNode {

    @Test
    public void createTextNode_givenText_ReturnsTextNode() {
        // [MethodUnderTest][Scenario]Test
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

}