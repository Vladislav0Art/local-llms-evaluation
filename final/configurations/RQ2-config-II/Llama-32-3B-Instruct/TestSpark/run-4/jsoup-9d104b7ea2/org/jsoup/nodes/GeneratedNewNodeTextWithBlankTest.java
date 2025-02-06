package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeTextWithBlankTest {

    @Test
    public void newNodeTextWithBlankTest() throws IOException {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
    }

}