package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextTest2 {

    @Test
    public void splitTextTest2() throws IOException {
        String text = "Hello, World!";
        StringBuilder sb = new StringBuilder();
        int offset = 5;
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("World!", result.text());
    }

}