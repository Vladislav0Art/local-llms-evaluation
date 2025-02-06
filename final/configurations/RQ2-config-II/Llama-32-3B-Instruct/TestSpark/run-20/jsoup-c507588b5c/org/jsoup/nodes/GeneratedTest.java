package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void nodeNameIsNode() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textMethodReturnsText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void textMethodIsOverriddenFromLeafNode() {
        LeafNode leafNode = Mockito.mock(LeafNode.class);
        when(leafNode.text()).thenReturn("text");
        TextNode textNode = new TextNode("", leafNode);
        assertEquals("text", textNode.text());
    }

    @Test
    public void getWholeTextReturnsEmptyStringWhenBlank() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void getWholeTextReturnsTextWhenNotBlank() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlankReturnsTrueForBlankTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankReturnsFalseForNonBlankTextNode() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextReturnsNewTextNodeWhenOffsetIsLessThanLength() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.splitText(3);
        assertNotNull(newTextNode);
        assertEquals(4, newTextNode.text().length());
    }

    @Test
    public void splitTextReturnsEmptyTextNodeWhenOffsetIsEqualToLength() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.splitText(textNode.text().length());
        assertNotNull(newTextNode);
        assertEquals(0, newTextNode.text().length());
    }

    @Test
    public void splitTextReturnsEmptyTextNodeWhenOffsetIsGreaterThanLength() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.splitText(textNode.text().length() + 1);
        assertNotNull(newTextNode);
        assertEquals(0, newTextNode.text().length());
    }

    @Test
    public void outerHtmlHeadAndTailAreCalledWithCorrectParameters() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(accum, 0, out);
        verify(accum).append("text");
    }

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, 0, out);
        verify(accum).append(equals(0));
    }

    @Test
    public void toStringReturnsCorrectString() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.toString());
    }

    @Test
    public void cloneCreatesNewTextNodeWithSameText() {
        TextNode textNode = new TextNode("text");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode.text(), clonedTextNode.text());
    }

    @Test
    public void createFromEncodedReturnsCorrectTextNode() {
        TextNode textNode = TextNode.createFromEncoded("text");
        assertNotNull(textNode);
        assertEquals("text", textNode.text());
    }

    @Test
    public void normaliseWhitespaceRemovesLeadingWhitespace() {
        assertEquals(" text ", StringUtil.normaliseWhitespace(" text "));
    }

    @Test
    public void stripLeadingWhitespaceReturnsEmptyStringForEmptyText() {
        assertEquals("", StringUtil.stripLeadingWhitespace(""));
    }

    @Test
    public void stripLeadingWhitespaceReturnsCorrectStringForNonEmptyText() {
        assertEquals("text", StringUtil.stripLeadingWhitespace("  text "));
    }

}