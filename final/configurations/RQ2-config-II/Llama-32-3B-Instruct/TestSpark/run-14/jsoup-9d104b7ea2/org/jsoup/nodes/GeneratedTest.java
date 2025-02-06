package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertThat(textNode.nodeName(), is(""));
    }

    @Test
    public void nodeName_NonEmptyText_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("Hello");
        assertThat(textNode.nodeName(), is("text"));
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertThat(textNode.text(), is(""));
    }

    @Test
    public void text_NonEmptyText_ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello");
        assertThat(textNode.text(), is("Hello"));
    }

    @Test
    public void text_NullArgument_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).text());
    }

    @Test
    public void createFromEncoded

    NullArgument_ReturnsNull() {
        String encodedText = null;
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThat(textNode, is(null));
    }

    @Test
    public void splitText_SplittingAtOffset_CorrectSplitResult() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        LeafNode expectedLeftChild = new LeafNode("Hello");
        LeafNode expectedRightChild = new LeafNode("World");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Appendable accum = new StringBuilder(outputStream);
        expectedRightChild.outerHtmlHead(accum, 0, null);
        textNode.splitText(6).outerHtmlTail(accum, 0, null);
        assertThat(outputStream.toString(), is("<div>Hello</div> <div>World</div>"));
    }

    @Test
    public void normaliseWhitespace_SingleSpace_SingleSpace() {
        String originalText = " ";
        String expectedText = " ";
        assertThat(TextNode.normaliseWhitespace(originalText), is(expectedText));
    }

    @Test
    public void stripLeadingWhitespace_TwoSpaces_ReturnsOneSpace() {
        String originalText = "  ";
        String expectedText = " ";
        assertThat(TextNode.stripLeadingWhitespace(originalText), is(expectedText));
    }

}