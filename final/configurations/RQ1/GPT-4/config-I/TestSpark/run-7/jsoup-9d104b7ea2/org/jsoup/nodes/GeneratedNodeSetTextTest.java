package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedNodeSetTextTest {

    @Test
    public void nodeSetTextTest() {
        TextNode node = new TextNode("Old Text");
        assertEquals(node.text(), "Old Text");
        node.text("New Text");
        assertEquals(node.text(), "New Text");
    }

}