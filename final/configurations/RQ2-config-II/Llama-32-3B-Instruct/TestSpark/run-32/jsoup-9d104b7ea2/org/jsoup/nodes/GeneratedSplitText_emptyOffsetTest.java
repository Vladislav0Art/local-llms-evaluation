package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedSplitText_emptyOffsetTest {

    @Test
    public void splitText_emptyOffsetTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode result = node.splitText(0);
        assertNotNull(result);
        assertTrue(result.text().isEmpty());
    }

}