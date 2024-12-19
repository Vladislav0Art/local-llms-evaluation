package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextTests {

    @Test
    public void splitTextTests() throws IOException {
        String text = "Hello\nWorld";
        int offset = 5;
        TextNode node1 = new TextNode(text);
        TextNode expected1 = new TextNode(text.substring(0, offset));
        assertEquals(expected1, node1.splitText(offset).clone());
    }

}