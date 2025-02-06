package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createTextNodeFromString() {
        String text = "Hello World";
        TextNode expectedTextNode = new TextNode(text);
        assertTrue(TextNode.createFromEncoded(text).equals(expectedTextNode));
    }

    @Test
    public void createTextNodeFromStringWithWhitespace() {
        String text = "   Hello   World  ";
        TextNode expectedTextNode = new TextNode(text);
        assertTrue(TextNode.createFromEncoded(text).equals(expectedTextNode));
    }

    @Test
    public void splitTextAtBeginning() {
        String text = "Hello";
        int offset = 0;
        TextNode originalTextNode = new TextNode(text);
        TextNode resultTextNode = originalTextNode.splitText(offset);
        assertNotNull(resultTextNode);
        assertEquals(originalTextNode.text(), resultTextNode.text());
    }

    @Test
    public void splitTextAtMiddle() {
        String text = "Hello World";
        int offset = 5;
        TextNode originalTextNode = new TextNode(text);
        TextNode resultTextNode = originalTextNode.splitText(offset);
        assertNotNull(resultTextNode);
        assertEquals(originalTextNode.text(), resultTextNode.text());
    }

    @Test
    public void splitTextAtEnd() {
        String text = "Hello World";
        int offset = 10;
        TextNode originalTextNode = new TextNode(text);
        TextNode resultTextNode = originalTextNode.splitText(offset);
        assertNotNull(resultTextNode);
        assertEquals(originalTextNode.text(), resultTextNode.text());
    }

    @Test
    public void isBlankTextNode() {
        String text = "";
        assertTrue(TextNode.createFromEncoded(text).isBlank());
    }

    @Test
    public void isNotBlankTextNode() {
        String text = "Hello World";
        assertFalse(TextNode.createFromEncoded(text).isBlank());
    }

}