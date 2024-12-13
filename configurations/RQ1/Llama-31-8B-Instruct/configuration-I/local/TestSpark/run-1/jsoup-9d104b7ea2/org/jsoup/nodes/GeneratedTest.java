package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textTest_Chaining() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
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
        assertEquals("", textNode.text());
        assertEquals("test", result.text());
    }

    @Test
    public void splitTextTest_OffsetEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(3);
        assertEquals("te", textNode.text());
        assertEquals("st", result.text());
    }

    @Test
    public void splitTextTest_OffsetNegative() {
        TextNode textNode = new TextNode("test");
        try {
            textNode.splitText(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

}