package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedSplitText_SplitAtOffset {

    @Test
    public void splitText_SplitAtOffset() {
        String text = "test";
        int offset = 3;
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertTrue(result.text().length() == 1);
    }

}