package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedText_setsCorrectValueTest {

    @Test
    public void text_setsCorrectValueTest() {
        String text = "test";
        TextNode textNode = new TextNode();
        textNode.text(text);
        assertEquals(text, textNode.value());
    }

}