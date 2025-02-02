package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_SplitsAtOffset {

    @Test
    public void splitText_SplitsAtOffset() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(0, offset, tailNode.getWholeText().length());
    }

}