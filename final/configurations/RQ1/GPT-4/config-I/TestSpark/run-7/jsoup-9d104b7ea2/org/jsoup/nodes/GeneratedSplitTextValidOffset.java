package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextValidOffset {

    @Test
    public void splitTextValidOffset() {
        TextNode node = new TextNode("Node");
        TextNode splitNode = node.splitText(2);
        assertEquals(node.text(), "No");
        assertEquals(splitNode.text(), "de");
    }

}