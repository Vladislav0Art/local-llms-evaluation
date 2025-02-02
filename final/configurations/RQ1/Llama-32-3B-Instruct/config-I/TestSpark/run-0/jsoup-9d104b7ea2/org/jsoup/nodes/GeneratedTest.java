package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void constructorTextNodeCreatesTextNodeWithCorrectValue() {
        // given
        String text = "test";

        // when
        TextNode textNode = new TextNode(text);

        // then
        Mockito.verify(textNode).value(text);
    }

    @Test
    public void nodeNameReturnsCorrectString() {
        // given
        TextNode textNode = new TextNode("test");

        // when
        String nodeName = textNode.nodeName();

        // then
        org.junit.Assert.assertEquals("#text", nodeName);
    }

    @Test
    public void textReturnsCorrectText() {
        // given
        String text = "test";

        // when
        TextNode textNode = new TextNode(text);

        // then
        org.junit.Assert.assertEquals("test", textNode.text());
    }

    @Test
    public void textSetsCorrectText() {
        // given
        String text = "test";
        TextNode textNode = new TextNode();

        // when
        textNode.text(text).text(text);

        // then
        org.junit.Assert.assertEquals(text, textNode.text());
    }

    @Test
    public void getWholeTextReturnsCorrectWholeText() {
        // given
        String text = "test";

        // when
        TextNode textNode = new TextNode(text);

        // then
        org.junit.Assert.assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlankReturnsCorrectBlankValue() {
        // given
        String text = "test";
        TextNode textNode = new TextNode(text);

        // when
        boolean blank = textNode.isBlank();

        // then
        org.junit.Assert.assertFalse(blank);
    }

    @Test
    public void isBlankReturnsCorrectBlankWhenOnlyWhitespace() {
        // given
        String text = "   ";
        TextNode textNode = new TextNode(text);

        // when
        boolean blank = textNode.isBlank();

        // then
        org.junit.Assert.assertTrue(blank);
    }

    @Test
    public void splitTextReturnsCorrectSplitTextNode() {
        // given
        String text = "test";
        int offset = 5;

        // when
        TextNode textNode = new TextNode(text);

        // then
        TextNode expectedTextNode = new TextNode("tes");
        org.junit.Assert.assertEquals(expectedTextNode, textNode.splitText(offset));
    }

    @Test
    public void outerHtmlHeadAppendsTextToAppendable() {
        // given
        Appendable appendable = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("test");

        // when
        textNode.outerHtmlHead(appendable, 0, new Document.OutputSettings());

        // then
        org.junit.Assert.assertNotNull(appendable.toString());
    }

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        // given
        Appendable appendable = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("test");

        // when
        textNode.outerHtmlTail(appendable, 0, new Document.OutputSettings());

        // then
        org.junit.Assert.assertTrue(appendable.toString().isEmpty());
    }

    @Test
    public void toStringReturnsCorrectString() {
        // given
        String text = "test";
        TextNode textNode = new TextNode(text);

        // when
        String toString = textNode.toString();

        // then
        org.junit.Assert.assertEquals(toString, "test");
    }

}