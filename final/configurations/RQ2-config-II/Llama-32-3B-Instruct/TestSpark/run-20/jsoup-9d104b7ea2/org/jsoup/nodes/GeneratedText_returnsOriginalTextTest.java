package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_returnsOriginalTextTest {

    @Test
    public void text_returnsOriginalTextTest() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}