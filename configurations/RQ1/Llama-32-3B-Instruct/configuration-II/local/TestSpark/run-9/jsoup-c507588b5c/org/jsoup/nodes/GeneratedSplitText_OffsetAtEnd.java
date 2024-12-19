package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedSplitText_OffsetAtEnd {

    @Test
    public void splitText_OffsetAtEnd() {
        String text = "test";
        int offset = text.length();
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertTrue(result.text().isEmpty());
    }

}