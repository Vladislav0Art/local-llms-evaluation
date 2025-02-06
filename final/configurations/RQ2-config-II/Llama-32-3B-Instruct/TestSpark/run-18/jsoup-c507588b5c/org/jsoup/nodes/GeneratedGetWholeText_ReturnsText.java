package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeText_ReturnsText {

    @Test
    public void getWholeText_ReturnsText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

}