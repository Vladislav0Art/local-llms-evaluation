package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedSplitText_SplitAtZeroOffset_ReturnsOriginalString {

    @Test
    public void splitText_SplitAtZeroOffset_ReturnsOriginalString() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.splitText(0));
    }

}