package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("TextNode");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("TextNode");
        assertEquals("TextNode", textNode.text());
    }

    @Test
    public void textWithParamTest() {
        TextNode textNode = new TextNode("TextNode");
        assertEquals("TextNode", textNode.text());
        textNode.text("NewTextNode");
        assertEquals("NewTextNode", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("TextNode");
        assertEquals("TextNode", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("TextNode");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("TextNode");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("xtNode", splitTextNode.text());
        assertEquals("Te", textNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("TextNode");
        Appendable appendable = mock(Appendable.class);
        textNode.outerHtmlHead(appendable, 1, mock(Document.OutputSettings.class));
        verify(appendable).append("TextNode");
    }

}