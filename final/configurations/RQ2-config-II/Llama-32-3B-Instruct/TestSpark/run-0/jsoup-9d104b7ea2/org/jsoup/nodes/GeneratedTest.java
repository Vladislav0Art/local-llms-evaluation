package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    @Test
    public void createTextNode_fromString_textIsCorrectTest() {
        String text = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void createTextNode_fromBlankText_textIsEmptyTest() {
        String text = "";
        TextNode textNode = TextNode.createFromEncoded(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void nodeName_isCorrectTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void clone_returnsSameTextNode_testForSameTextNodes() {
        String text = "Hello World";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertTrue(originalTextNode == clonedTextNode);
    }

    @Test
    public void normaliseWhitespace_replacesTabWithSpaceTest() {
        String text = "\tHello World";
        String expectedText = " Hello World ";
        String actualText = StringUtil.normaliseWhitespace(text);
        assertEquals(expectedText, actualText);
    }

    @Test
    public void stripLeadingWhitespace_returnsEmptyStringForEmptyInputTest() {
        String text = "";
        String expectedText = "";
        String actualText = StringUtil.stripLeadingWhitespace(text);
        assertEquals(expectedText, actualText);
    }

}