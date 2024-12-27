package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedSplitText_SplitAtNonZeroOffset_ReturnsSubstring {

    @Test
    public void splitText_SplitAtNonZeroOffset_ReturnsSubstring() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("World", node.splitText(6));
    }

}