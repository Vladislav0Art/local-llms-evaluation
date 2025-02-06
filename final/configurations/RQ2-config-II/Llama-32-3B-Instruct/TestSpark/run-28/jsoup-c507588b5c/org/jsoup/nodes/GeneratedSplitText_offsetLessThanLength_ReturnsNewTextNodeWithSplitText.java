package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedSplitText_offsetLessThanLength_ReturnsNewTextNodeWithSplitText {

    @Test
    public void splitText_offsetLessThanLength_ReturnsNewTextNodeWithSplitText() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        String result = textNode.splitText(6).text();
        assertEquals("World", result);
    }

}