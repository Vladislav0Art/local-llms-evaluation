package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedGetWholeText_TextContents_ReturnsCorrectText {

    @Test
    public void getWholeText_TextContents_ReturnsCorrectText() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}