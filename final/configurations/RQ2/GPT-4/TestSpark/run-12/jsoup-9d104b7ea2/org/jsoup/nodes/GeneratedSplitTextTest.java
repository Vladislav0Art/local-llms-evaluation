package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("sample text");
        TextNode split = node.splitText(6);
        assertEquals("sample", node.text());
        assertEquals(" text", split.text());
    }

}