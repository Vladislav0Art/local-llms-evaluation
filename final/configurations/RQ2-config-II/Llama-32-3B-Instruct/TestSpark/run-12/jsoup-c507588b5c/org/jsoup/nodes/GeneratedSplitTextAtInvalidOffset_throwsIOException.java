package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextAtInvalidOffset_throwsIOException {

    @Test
    public void splitTextAtInvalidOffset_throwsIOException() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = -1;
        try {
            textNode.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        offset = 12; // beyond the length of the string
        try {
            textNode.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}