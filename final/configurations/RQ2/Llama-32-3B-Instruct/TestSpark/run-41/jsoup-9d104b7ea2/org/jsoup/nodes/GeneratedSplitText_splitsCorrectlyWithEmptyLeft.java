package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_splitsCorrectlyWithEmptyLeft {

    @Test
    public void splitText_splitsCorrectlyWithEmptyLeft() throws IOException {
        TextNode node = new TextNode("");
        assertEquals(null, node.splitText(0));
        assertEquals("", node.text());
    }

}