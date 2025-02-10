package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.TextNode;
import org.jsoup.util.CharExtractor;
import org.jsoup.nodes.Node;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestTrimming {

    @Test
    public void testTrimming() {
        Node node = new TextNode("  Hello, World  ");
        node.splitText(5);
        assertEquals("  Hello, World", node.getWholeText());
    }

}