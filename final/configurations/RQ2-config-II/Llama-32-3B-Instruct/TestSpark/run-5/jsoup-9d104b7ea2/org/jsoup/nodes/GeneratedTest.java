package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newNodeTextShouldBeCreated() {
        // Given
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);

        // When
        String nodeValue = textNode.text();

        // Then
        Mockito.verify(StringUtil.class).normalizeWhitespace(text);
        Mockito.verify(TextNode.class, Mockito.times(1)).text(text);
    }

    @Test
    public void newNodeNodeNameShouldBeCreated() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        String nodeName = textNode.nodeName();

        // Then
        Mockito verifies (document().nodeName(), Mockito.once());
    }

    @Test
    public void newNodeWholeTextShouldBeCreated() {
        // Given
        TextNode textNode = new TextNode("Hello, World!");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        Mockito.verify(StringBuilder.class).append("Hello, World!");
    }

    @Test
    public void newNodeIsBlankShouldBeChecked() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean isBlank = textNode.isBlank();

        // Then
        Mockito verifies (isBlank(), Mockito.once()).withValue(true);
    }

    @Test
    public void newNodeSplitTextShouldSplitTextAtGivenOffset() {
        // Given
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);

        // When
        int offset = 5;
        String splitText = textNode.splitText(offset);

        // Then
        Mockito.verify(StringBuilder.class).append("World!");
    }

    @Test
    public void newNodeOuterHtmlHeadShouldBeCreated() {
        // Given
        Document document = new Document();
        TextNode textNode = new TextNode("<html>Hello, World!</html>");

        // When
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        String outerHtmlHead = textNode.outerHtmlHead(accum, depth, out);

        // Then
        Mockito.verify(out).setHtml(html("html"));
    }

    @Test
    public void newNodeOuterHtmlTailShouldBeCreated() {
        // Given
        Document document = new Document();
        TextNode textNode = new TextNode("<html>Hello, World!</html>");

        // When
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        String outerHtmlTail = textNode.outerHtmlTail(accum, depth, out);

        // Then
        Mockito.verify(out).setHtml(html(""));
    }

    @Test
    public void newNodeCloneShouldReturnNewTextNode() {
        // Given
        TextNode textNode = new TextNode("Hello, World!");

        // When
        TextNode clone = textNode.clone();

        // Then
        Mockito.verify(clone).text(Mockito.anyString());
    }

    @Test
    public void createTextNodeFromEncodedShouldCreateTextNodeFromEncoded() {
        // Given
        String encodedText = "Hello, World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // When
        String decodedText = textNode.text();

        // Then
        Mockito.verify(StringUtil.class).normalizeWhitespace(decodedText);
    }

    @Test
    public void stripLeadingWhitespaceShouldStripLeadingWhitespace() {
        // Given
        String text = "   Hello, World!";

        // When
        String strippedText = TextNode.stripLeadingWhitespace(text);

        // Then
        Mockito.verify(strippedText).toString().withValue("Hello, World!");
    }

    @Test
    public void lastCharIsWhitespaceShouldReturnLastCharAsWhitespaceIfPresent() {
        // Given
        StringBuilder sb = new StringBuilder("Hello");
        String lastChar = TextNode.lastCharIsWhitespace(sb).toString();

        // Then
        Mockito.verify(lastChar).equals(Mockito.any(Whitespace.class));
    }

}