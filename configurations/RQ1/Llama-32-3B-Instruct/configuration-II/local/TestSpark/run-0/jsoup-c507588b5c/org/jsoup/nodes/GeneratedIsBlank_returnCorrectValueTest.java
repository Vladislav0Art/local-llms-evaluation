package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedIsBlank_returnCorrectValueTest {

    @Test
    public void isBlank_returnCorrectValueTest() {
        String text = "test";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());

        String whitespaceOnlyText = "\n\t  ";
        textNode = new TextNode(whitespaceOnlyText);
        assertTrue(textNode.isBlank());
    }

}