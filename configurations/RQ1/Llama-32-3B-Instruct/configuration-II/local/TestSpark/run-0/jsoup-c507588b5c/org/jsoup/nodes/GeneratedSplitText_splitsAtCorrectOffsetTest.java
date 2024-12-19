package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedSplitText_splitsAtCorrectOffsetTest {

    @Test
    public void splitText_splitsAtCorrectOffsetTest() {
        String text = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World", tailNode.text());
    }

}