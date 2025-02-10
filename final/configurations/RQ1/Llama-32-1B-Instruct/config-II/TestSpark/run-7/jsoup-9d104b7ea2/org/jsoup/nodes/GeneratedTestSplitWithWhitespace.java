package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.TextNode;
import org.jsoup.util.CharExtractor;
import org.jsoup.nodes.Node;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestSplitWithWhitespace {

    @Test
    public void testSplitWithWhitespace() {
        Node node = new TextNode("Hello, World!");
        node.splitText(7);
        assertEquals("<p>Hello, World!</p>", node.getWholeText());
    }

}