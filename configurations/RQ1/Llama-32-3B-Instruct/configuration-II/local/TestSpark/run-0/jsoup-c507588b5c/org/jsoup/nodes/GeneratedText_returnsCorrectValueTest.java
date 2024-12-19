package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedText_returnsCorrectValueTest {

    @Test
    public void text_returnsCorrectValueTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace(text), textNode.text());
    }

}