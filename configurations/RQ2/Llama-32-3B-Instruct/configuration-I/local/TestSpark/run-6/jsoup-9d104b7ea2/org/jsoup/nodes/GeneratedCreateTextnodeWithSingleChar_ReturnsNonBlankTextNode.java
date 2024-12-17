package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateTextnodeWithSingleChar_ReturnsNonBlankTextNode {

    @Test
    public void createTextnodeWithSingleChar_ReturnsNonBlankTextNode() {
        String text = "a";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}