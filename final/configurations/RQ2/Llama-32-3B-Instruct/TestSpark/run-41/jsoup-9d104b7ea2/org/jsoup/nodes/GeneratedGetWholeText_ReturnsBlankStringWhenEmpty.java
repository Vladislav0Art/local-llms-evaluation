package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeText_ReturnsBlankStringWhenEmpty {

    @Test
    public void getWholeText_ReturnsBlankStringWhenEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}