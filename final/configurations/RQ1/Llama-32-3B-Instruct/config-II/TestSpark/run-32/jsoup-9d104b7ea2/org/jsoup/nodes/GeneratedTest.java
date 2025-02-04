package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void newTextNode_GivenNullReturnsNull() {
        when(parentNode).thenReturn(null);
        assertThat(new TextNode(null), is(null));
    }

    @Test
    public void createFromEncoded_GivenValidText_ReturnsTextNode() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThat(textNode.text(), is(" "));
    }

    @Test
    public void createFromEncoded_GivenInvalidText_ThrowsException() {
        String invalidText = "Invalid HTML";
        when(Entities.unescape(invalidText)).thenReturn("");
        assertThat(() -> TextNode.createFromEncoded(invalidText), throws(IOException.class));
    }

    @Test
    public void text_GivenValidText_ReturnsValidText() {
        TextNode textNode = new TextNode("Hello World");
        assertThat(textNode.text(), is("Hello World"));
    }

    @Test
    public void text_GivenBlankText_ReturnsBlankText() {
        TextNode textNode = new TextNode("");
        assertThat(textNode.text(), is(""));
    }

    @Test
    public void text_GivenWhitespaceText_ReturnsStripedWhitespaceText() {
        String originalText = "   Hello World  ";
        TextNode textNode = new TextNode(originalText);
        assertThat(TextNode.normaliseWhitespace(textNode.text()), is("Hello World"));
    }

    @Test
    public void isBlank_GivenValidText_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello");
        assertThat(textNode.isBlank(), is(false));
    }

    @Test
    public void isBlank_GivenBlankText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertThat(textNode.isBlank(), is(true));
    }

    @Test
    public void splitText_GivenValidText_SplitsCorrectly() {
        String originalText = "Hello World!";
        int offset = 6;
        when(parentNode).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        TextNode result = textNode.splitText(offset);
        assertThat(result.text(), is("World!"));
    }

    @Test
    public void splitText_GivenOffsetOutOfRange_ThrowsException() {
        String originalText = "Hello World!";
        int offset = 6;
        when(parentNode).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        assertThat(() -> textNode.splitText(offset), throws(IllegalArgumentException.class));
    }

    @Test
    public void outerHtml_GivenValidText_ReturnsCorrectHtml() {
        String originalText = "Hello World!";
        when(parentNode).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        assertThat(textNode.outerHtml(), is("<p>Hello World!</p>"));
    }

    @Test
    public void clone_GivenValidText_ReturnsSameTextNode() {
        String originalText = "Hello World!";
        when(parentNode).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        assertThat(textNode.clone(), is(textNode));
    }

}