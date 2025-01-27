package org.jsoup.nodes;

import org.jsoup.internal.StringUtilImpl;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createTextnodeFromStringTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertNotNull(node.text());
        assertEquals(text, node.text());
    }

    @Test
    public void nodeNameIsTextTest() {
        TextNode node = new TextNode("text");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void textMethodReturnsTextContentTest() {
        TextNode node = new TextNode("Hello, World!");
        assertNotNull(node.text());
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void textMethodThrowsNullPointerExceptionWhenCalledOnNullTextNodeTest() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).text());
    }

    @Test
    public void cloneReturnsNewTextnodeTest() {
        TextNode node = new TextNode("Hello, World!");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals(node.text(), clone.text());
    }

    @Test
    public void splitTextSplitsTextNodeIntoTwoNodesTest() {
        TextNode node = new TextNode("Hello, World!");
        int offset = 6;
        TextNode split1 = node.splitText(offset);
        TextNode split2 = node.splitText(0);
        assertNotNull(split1);
        assertNotNull(split2);
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "\t\r\n";
        assertEquals("   ", StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("\n")));
    }

    @Test
    public void splitTextNegativeOffsetThrowsNullPointerExceptionTest() {
        assertThrows(NullPointerException.class, () -> new TextNode("Hello, World!").splitText(-1));
    }

    @Test
    public void createTextNodeFromEncodedStringTest() {
        String encodedText = "%3Cp%3EHello%2C+World%3C%2Fp%3E";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node.text());
        assertEquals("Hello, World!", node.text());
    }

}