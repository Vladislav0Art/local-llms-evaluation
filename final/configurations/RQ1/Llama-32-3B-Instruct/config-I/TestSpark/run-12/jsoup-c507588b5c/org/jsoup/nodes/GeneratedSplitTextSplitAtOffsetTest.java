package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedSplitTextSplitAtOffsetTest {

    @Test
    public void splitTextSplitAtOffsetTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode tail = node.splitText(6);
        assertEquals(0, tail.value.indexOf("World"));
    }

}