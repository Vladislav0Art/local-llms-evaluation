package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Document parent;

    @Mock
    private Appendable appendable;

    @Before
    public void setup() {
        when(parentNode.addChildren(0, this)).thenReturn(this);
        when(parent.addNode(this)).thenReturn(this);
    }

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void text_GivenTextNode_ReturnsUnnormalizedText() {
        String normalizedText = "   Hello World   ";
        when(parentNode.getWholeText()).thenReturn(normalizedText);
        TextNode textNode = new TextNode(normalizedText);
        assertEquals(normalizedText, textNode.text());
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsFalse() {
        assertFalse(new TextNode("Hello World").isBlank());
    }

    @Test
    public void splitText_GivenTextNodeOffsetReturnsNewTextNode() {
        String text = "Hello World";
        when(parentNode.getWholeText()).thenReturn(text);
        int offset = 7;
        TextNode tailNode = new TextNode("World");
        when(tailNode.coreValue()).thenReturn(text.substring(offset));
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertEquals(result, tailNode);
    }

    @Test
    public void outerHtml_GivenTextNode_ReturnsUnnormalizedText() {
        String expectedOuterHtml = "<span>Hello World</span>";
        when(parentNode.getWholeText()).thenReturn("Hello World");
        TextNode textNode = new TextNode("Hello World");
        assertEquals(expectedOuterHtml, textNode.toString());
    }

    @Test
    public void clone_GivenTextNode_ReturnsSameType() {
        TextNode originalTextNode = new TextNode("Hello World");
        when(parentNode.getWholeText()).thenReturn("Hello World");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(clonedTextNode, originalTextNode);
    }

}