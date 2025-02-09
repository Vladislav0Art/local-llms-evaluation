package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextTest1 {

    @Test
    public void splitTextTest1() throws IOException {
        String text = "Hello, World!";
        StringBuilder sb = new StringBuilder();
        int offset = 0;
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
    }

}