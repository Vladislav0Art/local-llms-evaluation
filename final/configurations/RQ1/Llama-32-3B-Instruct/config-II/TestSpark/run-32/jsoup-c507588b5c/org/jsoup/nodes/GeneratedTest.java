package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void createTextNode_NormalText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        org.junit.Assert.assertEquals("Hello World", textNode.text());
    }

    @Test
    public void textMethod_NormalText_ReturnsNormalisedText() {
        TextNode textNode = new TextNode("   ");
        org.junit.Assert.assertEquals(StringUtil.normaliseWhitespace("   "), textNode.text());
    }

    @Test
    public void createTextNode_EmptyString_ReturnsTextNode() {
        String text = "";
        TextNode textNode = new TextNode(text);
        org.junit.Assert.assertNotNull(textNode);
    }

    @Test
    public void isBlank

    Method_ReturnsTrueForEmptyText() {
        TextNode textNode = new TextNode("");
        boolean result = textNode.isBlank();
        org.junit.Assert.assertTrue(result);
    }

    @Test
    public void isBlank

    Method_ReturnsFalseForNonEmptyText() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        boolean result = textNode.isBlank();
        org.junit.Assert.assertFalse(result);
    }

    @Test
    public void splitText_Method_SplitsTextNodeAtOffset() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        org.junit.Assert.assertEquals(tailNode.text(), "World");
    }

    @Test
    public void splitText_Method_SplitsTextNodeAtOffsetWithLeadingWhitespace() throws IOException {
        String text = "   Hello World";
        int offset = 3;
        TextNode tailNode = new TextNode(text).splitText(offset);
        org.junit.Assert.assertEquals(tailNode.text(), "World");
    }

    @Test
    public void outerHtmlMethod_HandlesNormalisedWhitespace() throws IOException {
        String text = "   ";
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        int depth = 0;
        Document document = new Document();
        parentNode.addChildren(0, new Element(document));
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, depth, out);
        org.junit.Assert.assertEquals(accum.toString(), "<p>&nbsp; &nbsp;</p>");
    }

    @Test
    public void outerHtmlMethod_HandlesTrimmingLeadingWhitespace() throws IOException {
        String text = "   Hello World";
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        int depth = 0;
        Document document = new Document();
        parentNode.addChildren(0, new Element(document));
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, depth, out);
        org.junit.Assert.assertEquals(accum.toString(), "<p>Hello World</p>");
    }

    @Test
    public void outerHtmlMethod_HandlesTrimmingTrailingWhitespace() throws IOException {
        String text = "Hello World   ";
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        int depth = 0;
        Document document = new Document();
        parentNode.addChildren(0, new Element(document));
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, depth, out);
        org.junit.Assert.assertEquals(accum.toString(), "<p>Hello World</p>");
    }

    @Test
    public void clone_Method_ReturnsCloneOfTextNode() {
        TextNode textNode = new TextNode("Hello");
        TextNode clonedTextNode = textNode.clone();
        org.junit.Assert.assertNotNull(clonedTextNode);
        org.junit.Assert.assertEquals(textNode.text(), clonedTextNode.text());
    }

    @Test
    public void createFromEncoded_Method_ParsesEncodedTextToNormalisedText() {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        org.junit.Assert.assertEquals("Hello", textNode.text());
    }

}