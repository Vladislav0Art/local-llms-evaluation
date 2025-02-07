package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nodeName_ReturnsTextNode() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void text_SetTextNodeText() {
        TextNode textNode = new TextNode("");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void getWholeText_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsFalse() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlank_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_ReturnsTextNode() {
        TextNode textNode = new TextNode("text");
        TextNode result = textNode.splitText(0);
        assertEquals("text", result.text());
    }

    @Test
    public void splitText_ThrowsIOException() {
        TextNode textNode = new TextNode("text");
        try {
            textNode.splitText(0);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void outerHtmlHead_AppendsHtml() throws IOException {
        TextNode textNode = new TextNode("text");
        StringWriter writer = new StringWriter();
        textNode.outerHtmlHead(writer, 0, null);
        assertEquals("<text>text</text>", writer.toString());
    }

}