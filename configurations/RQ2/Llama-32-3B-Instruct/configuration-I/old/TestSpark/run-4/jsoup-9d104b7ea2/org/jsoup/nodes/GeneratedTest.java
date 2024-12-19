package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTextTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textMethodTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void textSetterTest() {
        String newText = "Hello World";
        TextNode textNode = new TextNode("");
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlankTest_emptyString() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankTest_noWhitespace() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_atOffsetTest_emptyString() {
        int offset = 0;
        TextNode textNode = new TextNode("");
        TextNode expectedTextNode = new TextNode("");
        TextNode resultTextNodeBeforeSplit = textNode.splitText(offset);
        assertEquals(expectedTextNode, resultTextNodeBeforeSplit);
    }

    @Test
    public void splitText_atOffsetTest_emptyString_afterSplit() {
        int offset = 1;
        TextNode textNode = new TextNode("");
        TextNode expectedTextNodeBeforeSplit = new TextNode("");
        TextNode resultTextNodeBeforeSplitCopy = expectedTextNodeBeforeSplit; // Create a copy of resultTextNodeBeforeSplit
        TextNode resultTextNodeAfterSplit = resultTextNodeBeforeSplitCopy.splitText(offset);
        assertEquals(expectedTextNode, resultTextNodeAfterSplit); // Compare with the original expectedTextNode
    }

    @Test
    public void splitText_atOffsetTest_nonEmptyString() {
        int offset = 5;
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode expectedTextNodeBeforeSplit = new TextNode("Hello");
        TextNode resultTextNodeBeforeSplitCopy = expectedTextNodeBeforeSplit; // Create a copy of resultTextNodeBeforeSplit
        TextNode resultTextNodeAfterSplit = resultTextNodeBeforeSplitCopy.splitText(offset); // Split the copied resultTextNodeBeforeSplit instead of original one
        assertEquals(expectedTextNodeBeforeSplit, resultTextNodeAfterSplit);
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   ";
        String expectedText = " ";
        assertEquals(expectedText, TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceTest_emptyString() {
        String text = "";
        String expectedText = "";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceTest_singleSpace() {
        String text = " ";
        String expectedText = " ";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceTest_multipleSpaces() {
        String text = "   ";
        String expectedText = " ";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(text));
    }

}