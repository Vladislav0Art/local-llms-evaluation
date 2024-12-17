package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateTextnodeWithEmptyString_ReturnsBlankTextNode {

    @Test
    public void createTextnodeWithEmptyString_ReturnsBlankTextNode() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}