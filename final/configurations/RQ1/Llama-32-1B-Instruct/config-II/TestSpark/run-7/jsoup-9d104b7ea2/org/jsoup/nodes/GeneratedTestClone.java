package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.TextNode;
import org.jsoup.util.CharExtractor;
import org.jsoup.nodes.Node;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestClone {

    @Test
    public void testClone() throws IOException {
        Node node1 = new TextNode("   ");
        Node node2 = (TextNode) node1.clone();
        assertEquals(node1, node2);
    }

}