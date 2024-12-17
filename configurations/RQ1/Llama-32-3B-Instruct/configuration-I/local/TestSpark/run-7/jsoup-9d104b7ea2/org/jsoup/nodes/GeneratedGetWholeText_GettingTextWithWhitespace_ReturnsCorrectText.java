package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_GettingTextWithWhitespace_ReturnsCorrectText {

    @Test
    public void getWholeText_GettingTextWithWhitespace_ReturnsCorrectText() {
        TextNode textNode = new TextNode(" Hello World  ");
        String expectedText = "Hello World ";
        assertEquals(expectedText, textNode.getWholeText());
    }

}