package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotBlank {

    @Test
    public void isNotBlank() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

}