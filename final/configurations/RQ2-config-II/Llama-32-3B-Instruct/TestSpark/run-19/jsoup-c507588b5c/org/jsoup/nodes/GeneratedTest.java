package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.html5.OutputSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void nodeNameAsString() {
        TextNode textNode = new TextNode("text");
        Mockito.when(textNode.nodeName()).thenReturn("");
    }

    @Test
    public void textAsString() {
        TextNode textNode = new TextNode("text");
        Mockito.when(textNode.text()).thenReturn("text");
    }

    @Test
    public void textText() {
        String originalText = "original text";
        TextNode textNodeBefore = new TextNode(originalText);
        TextNode textNodeAfter = new TextNode("after text");

        textNodeAfter.text(originalText);

        Mockito.when(textNodeAfter.text()).thenReturn(originalText);
    }

    @Test
    public void getWholeTextAsString() {
        String originalText = "original text";
        TextNode textNodeBefore = new TextNode(originalText);
        TextNode textNodeAfter = new TextNode("after text");

        textNodeAfter.text(originalText);

        Mockito.when(textNodeBefore.getWholeText()).thenReturn(originalText);
    }

    @Test
    public void isBlankFalse() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextOffset() {
        String originalText = "original text";
        TextNode textNodeBefore = new TextNode(originalText);
        TextNode textNodeAfter = new TextNode("after text");

        textNodeAfter.text(originalText);

        textNodeBefore.splitText(0);
        assertEquals(originalText, textNodeAfter.text());
    }

    @Test
    public void outerHtmlHead() throws IOException {
        StringBuilder accumulator = new StringBuilder();
        int depth = 1;
        Document.OutputSettings outputSettings = new OutputSettings();

        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(accumulator, depth, outputSettings);

        assertEquals("<text>", accumulator.toString());
    }

    @Test
    public void outerHtmlTail() {
        StringBuilder accumulator = new StringBuilder();
        int depth = 1;
        Document.OutputSettings outputSettings = new OutputSettings();

        TextNode textNode = new TextNode("text");
        textNode.outerHtmlTail(accumulator, depth, outputSettings);

        assertEquals("", accumulator.toString());
    }

    @Test
    public void clone() {
        String originalText = "original text";
        TextNode textNodeBefore = new TextNode(originalText);
        TextNode textNodeAfter = new TextNode("after text");

        textNodeAfter.text(originalText);

        TextNode cloned = textNodeBefore.clone();

        assertEquals(originalText, cloned.text());
    }

    @Test
    public void createFromEncoded() {
        String encodedText = "encoded text";
        Mockito.when(TextNode.createFromEncoded(encodedText)).thenReturn(new TextNode("decoded text"));
    }

    @Test
    public void normaliseWhitespace() {
        String text = "\t\r\n ";
        assertEquals("   ", StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace() {
        String text = "leading whitespace";
        assertEquals("text", StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceFalse() {
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

    @Test
    public void lastCharIsWhitespaceTrue() {
        Mockito.when(StringBuilder.class, Mockito.mock(StringBuilder.class)).when(() -> {
            ((StringBuilder) Mockito.mock(StringBuilder.class)).append(' ');
            return (StringBuilder) this;
        }).thenAnswer((Mockito.IAnswer<StringBuilder>) () -> {
            StringBuilder sb = Mockito.mock(StringBuilder.class);
            sb.append(' ');
            return sb;
        });
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

}