package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertEquals("Sample Text", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getTextTest() {
        TextNode textNode = new TextNode("Test text");
        assertEquals("Test text", textNode.text());
    }

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("Testing");
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Whole text");
        assertThat(node.getWholeText(), is("Whole text"));
    }

    @Test
    public void isBlankTest() {
        TextNode blankNode = new TextNode(" ");
        assertTrue(blankNode.isBlank());

        TextNode nonBlankNode = new TextNode("NonBlank");
        assertFalse(nonBlankNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode split = textNode.splitText(7);
        assertEquals("World!", split.text());
        assertEquals("Hello,", textNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 1, outputSettings);
        assertEquals("Test", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 1, outputSettings);
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals(textNode.text(), textNode.clone().text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&amp;", false);
        assertEquals("&", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace(" Test    Text ");
        assertEquals(" Test Text ", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace(" Leading");
        assertEquals("Leading", result);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Testing "));
        assertTrue(result);
    }

}