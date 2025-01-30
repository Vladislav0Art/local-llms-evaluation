package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeIsEmptyStringTest() {
        String text = "";
        TextNode tn = new TextNode(text);
        assertNotNull(tn);
        assertTrue(tn.isBlank());
        assertEquals(text, tn.getWholeText());
    }

    @Test
    public void textNodeIsNotEmptyStringTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        assertNotNull(tn);
        assertFalse(tn.isBlank());
        assertEquals(text, tn.getWholeText());
    }

    @Test
    public void textNodeHasCorrectNodeNameTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        assertEquals("#text", tn.nodeName());
    }

    @Test
    public void textNodeSetTextTest() {
        String text = "some text";
        String newText = "new text";
        TextNode tn = new TextNode(text);
        tn.text(newText);
        assertEquals(newText, tn.getWholeText());
    }

    @Test
    public void textNodeSplitStringTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        TextNode splitNode = tn.splitText(4);
        assertEquals("some", tn.getWholeText());
        assertEquals(" text", splitNode.getWholeText());
    }

    @Test
    public void textNodeSplitStringInvalidOffsetNegativeTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        tn.splitText(-1);
    }

    @Test
    public void textNodeSplitStringInvalidOffsetGreaterTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        tn.splitText(100);
    }

    @Test
    public void textNodeCloneTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        TextNode clonedTn = tn.clone();
        assertFalse(tn == clonedTn);
        assertEquals(tn.getWholeText(), clonedTn.getWholeText());
    }

    @Test
    public void textNodeCreateFromEncodedTest() {
        String encodedText = "&amp;hello&nbsp;world!";
        TextNode tn = TextNode.createFromEncoded(encodedText);
        assertEquals("&hello world!", tn.getWholeText());
    }

    @Test
    public void textNodeToStringTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        assertNotNull(tn.toString());
    }

}