package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    public TextNode textNode = new TextNode("");

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = TextNode.createFromEncoded(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsNodeType() {
        String nodeName = "text";
        when(text).thenReturn(nodeName);
        TextNode textNode = new TextNode(text);
        assertEquals(nodeName, textNode.nodeName());
    }

    @Test
    public void text_GivenTextNodeAndText_ReturnsText() {
        String textToSet = "Hello World!";
        when(text).thenReturn(textToSet);
        TextNode textNode = new TextNode(text);
        assertEquals(textToSet, textNode.text());
    }

    @Test
    public void text_GivenTextNode_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertNull(textNode.text());
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsText() {
        String wholeText = "Hello World!";
        when(text).thenReturn(wholeText);
        TextNode textNode = new TextNode(text);
        assertEquals(wholeText, textNode.getWholeText());
    }

    @Test
    public void splitText_GivenTextNodeAndOffset_ReturnsSplitTextNode() throws Exception {
        TextNode textNode = new TextNode("Hello World!");
        when(text).thenReturn("Hello\nWorld!");
        TextNode splitTextNode = textNode.splitText(0);
        assertNotNull(splitTextNode);
    }

    @Test
    public void clone_GivenTextNode_ReturnsClone() {
        TextNode clonedTextNode = new TextNode("Hello World!");
        when(text).thenReturn("Hello World!");
        TextNode clone = clonedTextNode.clone();
        assertNotNull(clone);
    }

    @Test
    public void testBlankMethod() {
        when(textNode.isBlank()).thenReturn(true);
        assertTrue(textNode.isBlank());
    }

}