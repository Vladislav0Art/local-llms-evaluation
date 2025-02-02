package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Node parentNode;

    @Mock
    private Node nextSibling;

    @Mock
    private Element parent;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public TextNode testTextNode() {
        return new TextNode("Hello");
    }

    public TextNode testTextNodeWithBlankText() {
        return new TextNode("");
    }

    public String testWholeText() {
        return "World!";
    }

    public String testNormalisedWhitespace() {
        return "   ";
    }

    @Test
    public void [
    textNode creation][
    with normal
    text]

    Test() {
        when(parentNode.text()).thenReturn("Hello World!");
        TextNode textNode = new TextNode(testTextNode().nodeName());
        assertEquals("Hello", textNode.value());
    }

    @Test
    public void [
    textNode creation][
    with blank
    text]

    Test() {
        TextNode textNode = testTextNodeWithBlankText();
        assertTrue(textNode.isBlank());
    }

    @Test
    public void [
    textNode text][
    normalised whitespace]

    Test() {
        when(parentNode.text()).thenReturn(testNormalisedWhitespace());
        TextNode textNode = new TextNode("Hello");
        assertEquals("   ", textNode.text());
    }

    @Test
    public void [
    textNode text][
    without leading
    space]

    Test() {
        TextNode textNode = testTextNode();
        assertEquals("Hello", textNode.text());
    }

    @Test
    public void [wholeText][
    normalised whitespace]

    Test() {
        when(parentNode.getWholeText()).thenReturn(testNormalisedWhitespace());
        TextNode textNode = new TextNode(testTextNode().nodeName());
        assertEquals("   ", textNode.getWholeText());
    }

    @Test
    public void [wholeText][
    without leading
    space]

    Test() {
        TextNode textNode = testTextNode();
        assertEquals("Hello World!", textNode.getWholeText());
    }

    @Test
    public void [isBlank][
    with text]

    Test() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void [isBlank][
    without text]

    Test() {
        TextNode textNode = testTextNodeWithBlankText();
        assertTrue(textNode.isBlank());
    }

    @Test
    public void [splitText][
    with offset 0]

    Test() {
        when(parentNode.text()).thenReturn("Hello World!");
        TextNode textNode = new TextNode(testTextNode().nodeName());
        TextNode result = textNode.splitText(0);
        assertEquals("Hello", result.value());
    }

    @Test
    public void [splitText][
    with offset 1]

    Test() {
        when(parentNode.text()).thenReturn("Hello World!");
        TextNode textNode = new TextNode(testTextNode().nodeName());
        TextNode result = textNode.splitText(1);
        assertEquals("World!", result.value());
    }

    @Test
    public void [splitText][
    with offset
    at end]

    Test() {
        when(parentNode.text()).thenReturn("Hello World!");
        TextNode textNode = new TextNode(testTextNode().nodeName());
        TextNode result = textNode.splitText(5);
        assertEquals("", result.value());
    }

}