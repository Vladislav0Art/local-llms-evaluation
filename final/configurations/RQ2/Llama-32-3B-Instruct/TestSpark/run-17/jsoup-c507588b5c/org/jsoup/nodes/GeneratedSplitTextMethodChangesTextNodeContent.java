package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedSplitTextMethodChangesTextNodeContent {

    @Test
    public void splitTextMethodChangesTextNodeContent() {
        String text = "hello";
        int offset = 1;
        TextNode original = TextNode.createFromEncoded(text);
        TextNode split = original.splitText(offset);
        assertEquals(text.substring(0, offset), original.text());
        assertNotEquals("", split.text());
    }

}