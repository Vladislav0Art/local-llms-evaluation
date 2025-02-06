package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToString_ReturnsText {

    @Test
    public void toString_ReturnsText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.toString());
    }

}