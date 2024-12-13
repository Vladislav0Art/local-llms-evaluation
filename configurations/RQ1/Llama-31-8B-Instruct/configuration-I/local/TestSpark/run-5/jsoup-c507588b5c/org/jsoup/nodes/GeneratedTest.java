package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   test   ");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textTest_Chaining() {
        TextNode textNode = new TextNode("   test   ");
        TextNode result = textNode.text("new text");
        assertEquals("new text", result.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("   test   ");
        assertEquals("   test   ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest_Empty() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankTest_Whitespace() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankTest_NotBlank() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest_OffsetZero() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(0);
        assertEquals("", result.text());
        assertEquals("test", textNode.text());
    }

    @Test
    public void splitTextTest_OffsetEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(3);
        assertEquals("", result.text());
        assertEquals("est", textNode.text());
    }

    @Test
    public void splitTextTest_OffsetMiddle() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(1);
        assertEquals("t", result.text());
        assertEquals("est", textNode.text());
    }

}