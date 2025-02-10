package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.TextNode;
import org.jsoup.util.CharExtractor;
import org.jsoup.nodes.Node;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBlankOffset {

    @Test
    public void testBlankOffset() {
        Node node = new TextNode("   ");
        node.splitText(5);
        assertEquals(" ", node.getWholeText());
    }

}