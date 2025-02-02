package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void createTextNode_EmptyText_returnsBlankTextNode() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.text(), is(""));
    }

    @Test
    public void createTextNode_NullText_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null));
    }

    @Test
    public void textSetTextsValue() {
        String value = "Hello World";
        TextNode textNode = new TextNode(value);
        textNode.text("New Value");
        assertThat(textNode.text(), is("New Value"));
    }

    @Test
    public void getWholeText_returnsUnencodedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.getWholeText(), is(text));
    }

    @Test
    public void isBlank_ReturnsTrueIfTextIsEmpty() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.isBlank(), is(true));
    }

    @Test
    public void splitText_SplitsTextAtOffset_CreatesNewTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(6);
        assertThat(tailNode.text(), is("World"));
    }

    @Test
    public void outerHtmlHead_HandlesNormalisedWhitespace() {
        String text = "\n Hello \n World";
        when(StringUtil.normaliseWhitespace(text)).thenReturn("\n Hello  World");
        TextNode textNode = new TextNode(text);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        document.output(out, accum);
        assertThat(accum.toString(), is("<span> Hello  World</span>"));
    }

    @Test
    public void outerHtmlTail_IgnoresEmptyText() {
        String text = "Hello World";
        when(StringUtil.normaliseWhitespace(text)).thenReturn(" ");
        TextNode textNode = new TextNode(text);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        document.output(out, accum);
        assertThat(accum.toString(), is(""));
    }

    @Test
    public void outerHtmlTail_HandlesEmptyText() {
        String text = "";
        when(StringUtil.normaliseWhitespace(text)).thenReturn("");
        TextNode textNode = new TextNode(text);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        document.output(out, accum);
        assertThat(accum.toString(), is(""));
    }

    @Test
    public void createFromEncodedUnescapesText() {
        String encodedText = "&lt;Hello World&gt;";
        when(StringUtil.unescape(encodedText)).thenReturn("Hello World");
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThat(textNode.text(), is("Hello World"));
    }

    @Test
    public void createFromEncoded_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> TextNode.createFromEncoded(null));
    }

}