package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertEquals("#text", tn.nodeName());
    }

    @Test
    public void textSetterAndGetterTest() {
        TextNode tn = new TextNode("test text");
        tn.text("new test text");
        Assert.assertEquals("new test text", tn.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertEquals("test text", tn.getWholeText());
    }

    @Test
    public void isBlankPositiveTest() {
        TextNode tn = new TextNode("    ");
        Assert.assertTrue(tn.isBlank());
    }

    @Test
    public void isBlankNegativeTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertFalse(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("hello world");
        TextNode splitNode = tn.splitText(5);
        Assert.assertEquals("hello", tn.text());
        Assert.assertEquals(" world", splitNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlHead(sb, 0, new Document.OutputSettings().prettyPrint(false));
        Assert.assertEquals("test text", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlTail(sb, 0, new Document.OutputSettings().prettyPrint(false));
        // As outerHtmlTail function does not change 'sb', so it will remain empty
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertEquals("test text", tn.toString());
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("test text");
        TextNode cloned = tn.clone();
        Assert.assertNotSame(tn, cloned);
        Assert.assertEquals(tn.text(), cloned.text());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;p&gt;Hello World&lt;/p&gt;";
        String expectedText = Parser.unescapeEntities(encodedText, false);
        Assert.assertEquals(expectedText, TextNode.createFromEncoded(encodedText).getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String textWithExtraSpaces = "   Hello     World    ";
        String expectedText = "Hello World";
        Assert.assertEquals(expectedText, TextNode.normaliseWhitespace(textWithExtraSpaces));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingSpaces = "  Hello World";
        String expectedText = "Hello World";
        Assert.assertEquals(expectedText, TextNode.stripLeadingWhitespace(textWithLeadingSpaces));
    }

    @Test
    public void lastCharIsWhitespacePositiveTest() {
        StringBuilder sb = new StringBuilder().append("Hello World ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}