package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeName_ReturnsNodeName() {
        TextNode textNode = new TextNode("node");
        assertEquals("node", textNode.nodeName());
    }

    @Test
    public void text_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void setTextNodeText_SetsTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.setTextNodeText("newText");
        assertEquals("newText", textNode.text());
    }

    @Test
    public void getWholeText_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsFalseWhenTextNodeTextNotBlank() {
        TextNode textNode = new TextNode("text");
        boolean result = textNode.isBlank();
        assertFalse(result);
    }

    @Test
    public void isBlank_ReturnsTrueWhenTextNodeTextIsBlank() {
        TextNode textNode = new TextNode("");
        boolean result = textNode.isBlank();
        assertTrue(result);
    }

    @Test
    public void splitText_SplitsTextNodeAtOffsetAndCreatesNewTextNode() {
        TextNode textNode = new TextNode("text");
        TextNode newNode = textNode.splitText(3);
        assertEquals(4, newNode.text().length());
    }

    @Test
    public void outerHtmlHead_AppendsTextNodeToAppendable() throws IOException {
        Appendable accum = mock(Appendable.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(accum);
        verify(accum).append(eq("text"));
    }

    @Test
    public void outerHtmlTail_AppendsTextNodeToAppendable() throws IOException {
        Appendable accum = mock(Appendable.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlTail(accum);
        verify(accum).append(eq("text"));
    }

    @Test
    public void defaultSettings_ReturnsDefaultSettings() {
        Document.OutputSettings settings = mock(Document.OutputSettings.class);
        assertEquals(defaultSettings(), settings.defaultSettings());
    }

    @Test
    public void textNodeConstructor_TakesStringParameter() {
        TextNode textNode = new TextNode("text");
        assertNotNull(textNode);
    }
}

class Appendable {
    public void append(String str) {
    }
}

class Document {
    static class OutputSettings {
        public String defaultSettings() {
            return "default";
        }
    }

}