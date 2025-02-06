package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_splitsAtOffset_atEnd_ofString {

    @Test
    public void splitText_splitsAtOffset_atEnd_ofString() throws IOException {
        String text = "Hello";
        TextNode node = new TextNode(text);
        int offset = text.length();
        TextNode secondPart = node.splitText(offset);
        assertTrue(secondPart.isBlank());
    }

}