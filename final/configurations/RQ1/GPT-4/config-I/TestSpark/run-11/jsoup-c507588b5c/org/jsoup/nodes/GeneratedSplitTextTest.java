package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        TextNode split = node.splitText(7);
        assertEquals(node.getWholeText(), "Hello, ");
        assertEquals(split.getWholeText(), "World!");
    }

}