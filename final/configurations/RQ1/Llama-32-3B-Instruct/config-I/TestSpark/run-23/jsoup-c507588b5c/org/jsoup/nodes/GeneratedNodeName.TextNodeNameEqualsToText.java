package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeName.

TextNodeNameEqualsToText {

    @Test
    public void nodeName.TextNodeNameEqualsToText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("#text", textNode.nodeName());
    }

}