package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void TextNodeConstructor_WithValidString_ShouldCreateNewInstance() {
        TextNode textNode = new TextNode("ValidText");
        Assert.assertNotNull(textNode);
    }

    @Test
    public void nodeName_ValidText_ShouldReturnTextNode() {
        TextNode textNode = new TextNode("#text");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ValidText_ShouldReturnGivenText() {
        TextNode textNode = new TextNode("GivenText");
        Assert.assertEquals("GivenText", textNode.text());
    }

    @Test
    public void text_SetNewText_ShouldReturnTextNodeWithNewText() {
        TextNode textNode = new TextNode("OldText");
        Assert.assertEquals("NewText", textNode.text("NewText").text());
    }

    @Test
    public void getWholeText_ValidText_ShouldReturnText() {
        TextNode textNode = new TextNode("WholeTextTest");
        Assert.assertEquals("WholeTextTest", textNode.getWholeText());
    }

    @Test
    public void isBlank_WithBlankString_ShouldReturnTrue() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_WithNonBlankString_ShouldReturnFalse() {
        TextNode textNode = new TextNode("NonBlank");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplitInMiddle_ShouldSplitText() {
        TextNode textNode = new TextNode("SplitText");
        TextNode splitNode = textNode.splitText(4);
        Assert.assertEquals("Text", splitNode.getWholeText());
    }

    @Test
    public void outerHtmlHead_AppendingEditable_ShouldNotThrowException() {
        TextNode textNode = new TextNode("TestNode");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            textNode.outerHtmlHead(accum, 0, out);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void outerHtmlTail_AppendingEditable_ShouldNotThrowException() {
        TextNode textNode = new TextNode("TestNode");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            textNode.outerHtmlTail(accum, 0, out);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void toString_WithTextNode_ShouldReturnString() {
        TextNode textNode = new TextNode("TestNode");
        Assert.assertEquals("TestNode", textNode.toString());
    }

    @Test
    public void clone_WithTextNode_ShouldReturnCloneOfTextNode() {
        TextNode textNode = new TextNode("TestNode");
        TextNode cloneNode = textNode.clone();
        Assert.assertEquals(textNode.toString(), cloneNode.toString());
    }

    @Test
    public void createFromEncoded_EncodedText_ShouldCreateTextNode() {
        TextNode textNode = TextNode.createFromEncoded("EncodedText");
        Assert.assertNotNull(textNode);
        Assert.assertEquals("EncodedText", textNode.text());
    }

    @Test
    public void normaliseWhitespace_WithWhitespace_ShouldReturnNormalizedString() {
        String result = TextNode.normaliseWhitespace(" White space ");
        Assert.assertEquals("White space", result);
    }

    @Test
    public void stripLeadingWhitespace_WithLeadingWhitespace_ShouldStripWhitespace() {
        String result = TextNode.stripLeadingWhitespace(" White space");
        Assert.assertEquals("White space", result);
    }

    @Test
    public void lastCharIsWhitespace_CharIsWhitespace_ShouldReturnTrue() {
        StringBuilder sb = new StringBuilder(" ");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(result);
    }

    @Test
    public void lastCharIsWhitespace_CharIsNotWhitespace_ShouldReturnFalse() {
        StringBuilder sb = new StringBuilder("NotWhitespace");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertFalse(result);
    }

}