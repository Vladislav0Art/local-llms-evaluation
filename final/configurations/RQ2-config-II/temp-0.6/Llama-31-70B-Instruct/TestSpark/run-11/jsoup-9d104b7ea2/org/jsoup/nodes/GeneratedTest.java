package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testTextNode_Constructor() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.nodeName());
    }

    @Test
    public void testTextNode_Text() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void testTextNode_Text_SetText() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void testTextNode_GetWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testTextNode_IsBlank() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testTextNode_SplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("st", splitTextNode.text());
    }

    @Test
    public void testTextNode_OuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("test");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append("test")).thenReturn(appendable);
        textNode.outerHtmlHead(appendable, 1, null);
        Mockito.verify(appendable).append("test");
    }

}