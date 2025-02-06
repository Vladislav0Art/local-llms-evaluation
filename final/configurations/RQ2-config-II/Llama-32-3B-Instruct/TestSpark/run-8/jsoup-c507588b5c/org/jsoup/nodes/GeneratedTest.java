package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedTest {

    @Test
    public void textNodeConstructWithText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.text(), is(text));
    }

    @Test
    public void textNodeConstructWithEmptyString() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.text(), is(""));
    }

    @Test
    public void nodeNameReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.nodeName(), is("text-node"));
    }

    @Test
    public void textReturnsText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.text(), is(text));
    }

    @Test
    public void textSetAndGetText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        textNode.text("New Text");
        assertThat(textNode.text(), is("New Text"));
    }

    @Test
    public void getWholeTextReturnsConcatenatedText() {
        String text1 = "Hello ";
        String text2 = "World";
        TextNode textNode1 = new TextNode(text1);
        TextNode textNode2 = new TextNode(text2);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable accum = output;
        try {
            Document.OutputSettings out = null;
            textNode1.outerHtmlHead(accum, 0, out);
            textNode2.outerHtmlHead(accum, 0, out);
        } catch (IOException e) {
            fail("Unexpected exception");
        }
        assertThat(output.toString().trim(), is(text1 + text2));
    }

    @Test
    public void isBlankReturnsFalseForNonEmptyString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.isBlank(), is(false));
    }

    @Test
    public void isBlankReturnsTrueForEmptyString() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.isBlank(), is(true));
    }

    @Test
    public void splitTextSplitAtGivenOffset() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result1 = textNode.splitText(6);
        TextNode expected1 = new TextNode("World");
        assertThat(result1.text(), is(expected1.text()));
        TextNode result2 = textNode.splitText(12);
        TextNode expected2 = new TextNode("!");
    }

    @Test
    public void outerHtmlHeadAndTailShouldNotThrowException() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = null;
        try {
            textNode.outerHtmlHead(accum, 0, out);
            textNode.outerHtmlTail(accum, 0, out);
        } catch (IOException e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void cloneReturnsNewTextNode() throws Exception {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.clone();
        assertThat(result.text(), is(text));
    }

    @Test
    public void createFromEncodedShouldCreateValidTextNode() throws Exception {
        String encodedText = "&lt;span&gt;Hello World&lt;/span&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThat(textNode.nodeName(), is("span"));
        assertThat(textNode.text(), is("Hello World"));
    }

    @Test
    public void normaliseWhitespaceShouldReturnStringWithoutLeadingWhitespace() {
        String text = "   Hello World";
        String result = StringUtil.normaliseWhitespace(text);
        assertThat(result, is("Hello World"));
    }

    @Test
    public void stripLeadingWhitespaceShouldRemoveLeadingWhitespaceFromText() {
        String text = "   Hello World";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertThat(result, is("Hello World"));
    }

    @Test
    public void lastCharIsWhitespaceShouldReturnFalseForNonWhitespaceCharacter() {
        StringBuilder sb = new StringBuilder("H");
        boolean result = StringUtil.lastCharIsWhitespace(sb);
        assertThat(result, is(false));
    }

}