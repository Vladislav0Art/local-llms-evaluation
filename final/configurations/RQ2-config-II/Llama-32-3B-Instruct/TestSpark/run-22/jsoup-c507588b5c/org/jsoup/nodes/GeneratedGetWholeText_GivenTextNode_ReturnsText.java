package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetWholeText_GivenTextNode_ReturnsText {

    @Test
    public void getWholeText_GivenTextNode_ReturnsText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

}