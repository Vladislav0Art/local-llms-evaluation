package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeText_ReturnsCorrectText {

    @Test
    public void getWholeText_ReturnsCorrectText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

}