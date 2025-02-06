package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedSplitText_offsetAtEndTest {

    @Test
    public void splitText_offsetAtEndTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode result = node.splitText(text.length());
        assertNotNull(result);
        assertTrue(result.text().isEmpty());
    }

}