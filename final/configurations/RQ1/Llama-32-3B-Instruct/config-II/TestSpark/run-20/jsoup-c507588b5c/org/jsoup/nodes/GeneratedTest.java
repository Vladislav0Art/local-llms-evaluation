package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void createTextNode_GivenValidText_ReturnsNewTextNode() {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        assertEquals(text, newNode.value());
    }

    @Test
    public void text_GivenBlankText_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void text_GivenValidText_ReturnsUnescapedText() {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        newNode.text(" ");
        assertEquals("Hello World", StringUtil.normaliseWhitespace(newNode.getWholeText()));
    }

    @Test
    public void isBlank_GivenValidText_ReturnsFalse() {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        assertFalse(newNode.isBlank());
    }

    @Test
    public void isBlank_GivenBlankText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_GivenValidTextSplitAtOffset_ReturnsNewTextNode() throws IOException {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        newNode.splitText(5);
        assertEquals("Hello", StringUtil.normaliseWhitespace(newNode.getWholeText()));
    }

    @Test
    public void splitText_GivenOffsetOutOfRange_ThrowsInvalidOperationException() {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        assertThrows(InvalidArgumentException.class, () -> newNode.splitText(-1));
    }

    @Test
    public void outerHtml_GivenValidText_ReturnsOuterHtml() throws IOException {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        StringBuilder result = new StringBuilder();
        newNode.outerHtmlHead(result, 0, null);
        assertEquals("<p>Hello World</p>", result.toString());
    }

    @Test
    public void outerHtml_GivenBlankTextAndParentTagsBlockIndentNode() throws IOException {
        String text = "";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        StringBuilder result = new StringBuilder();
        newNode.outerHtmlHead(result, 0, null);
        assertEquals("", result.toString());
    }

    @Test
    public void createTextNodeFromEncoded_GivenValidText_ReturnsNewTextNode() {
        String encodedText = "&lt;Hello&gt; World&lt;/Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", textNode.value());
    }

}