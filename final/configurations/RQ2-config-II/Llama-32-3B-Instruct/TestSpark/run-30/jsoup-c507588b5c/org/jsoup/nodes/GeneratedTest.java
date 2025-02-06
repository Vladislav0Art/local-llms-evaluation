package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void nodeName_WorksWhenNotBlank() {
        String text = "test";
        String nodeName = new TextNode(text).nodeName();
        assertEquals("text", nodeName);
    }

    @Test
    public void nodeName_DoesntWorkWhenBlank() {
        String text = "";
        String nodeName = new TextNode(text).nodeName();
        assertNull(nodeName);
    }

    @Test
    public void text_WorksCorrectly() {
        String text = "test";
        String nodeText = new TextNode(text).text();
        assertEquals("test", nodeText);
    }

    @Test
    public void text_SetsNewTextWhenProvided() {
        String originalText = "original";
        String newText = "new";
        String nodeText = new TextNode(originalText).text(newText);
        assertEquals(newText, nodeText);
    }

    @Test
    public void getWholeText_WorksCorrectly() {
        String text = "test";
        String wholeText = new TextNode(text).getWholeText();
        assertEquals("test", wholeText);
    }

    @Test
    public void isBlank_ReturnsTrueForBlankText() {
        String blankText = "";
        boolean result = new TextNode(blankText).isBlank();
        assertTrue(result);
    }

    @Test
    public void isBlank_ReturnsFalseNonBlankText() {
        String nonBlankText = "test";
        boolean result = new TextNode(nonBlankText).isBlank();
        assertFalse(result);
    }

    @Test
    public void splitText_SplitsCorrectly() throws IOException {
        String originalText = "test";
        int offset = 3;
        String[] parts = new TextNode(originalText).splitText(offset).toString().split("");
        assertEquals(2, parts.length);
    }

    @Test
    public void outerHtmlHead_WorksWhenDepthIsOne() throws IOException {
        String originalText = "test";
        Document doc = Document.parse("original");
        Appendable accum = new Appendable();
        Document.OutputSettings out = new Document.OutputSettings();

        new TextNode(originalText).outerHtmlHead(accum, 1, out);

        assertTrue(StringUtil.containsHTML(accum.toString(), originalText));
    }

    @Test
    public void outerHtmlTail_WorksWhenDepthIsZero() {
        String originalText = "test";
        Document doc = Document.parse("original");
        Appendable accum = new Appendable();
        Document.OutputSettings out = new Document.OutputSettings();

        new TextNode(originalText).outerHtmlTail(accum, 0, out);
    }

    @Test
    public void clone_ReturnsNewTextNode() {
        String text = "test";
        TextNode cloned = new TextNode(text).clone();
        assertNotNull(cloned);
    }

    @Test
    public void createFromEncoded_DoesNotThrowException() {
        String encodedText = "";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
    }

}