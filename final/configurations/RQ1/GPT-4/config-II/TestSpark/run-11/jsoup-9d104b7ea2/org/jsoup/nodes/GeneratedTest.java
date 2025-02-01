package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("    Test     ");
        String expected = "Test";
        Assert.assertEquals(expected, textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode(" Test ");
        String expected = " Test ";
        Assert.assertEquals(expected, textNode.getWholeText());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split Text");
        TextNode tailNode = textNode.splitText(5);
        Assert.assertEquals("Split ", textNode.getWholeText());
        Assert.assertEquals("Text", tailNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Split Test");
        textNode.splitText(-1);
    }

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode("   ");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Not Blank");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode(" Test ");
        Appendable appendableMock = mock(Appendable.class);
        Document.OutputSettings outputSettingsMock = mock(Document.OutputSettings.class);
        when(outputSettingsMock.prettyPrint()).thenReturn(true);
        textNode.outerHtmlHead(appendableMock, 0, outputSettingsMock);
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode(" Test ");
        Appendable appendableMock = mock(Appendable.class);
        textNode.outerHtmlTail(appendableMock, 0, new Document.OutputSettings());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test");
        String expected = "Test";
        Assert.assertEquals(expected, textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Clone Test");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(clonedNode, textNode);
        Assert.assertEquals(clonedNode.getWholeText(), textNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String expected = "<Test>";
        Assert.assertEquals(expected, textNode.getWholeText());
    }

    @Test
    public void textSetTextTest() {
        String text = "Test Text";
        TextNode textNode = new TextNode(text);
        String newText = "New Test Text";
        textNode.text(newText);
        Assert.assertNotEquals(text, textNode.text());
        Assert.assertEquals(newText, textNode.text());
    }

}