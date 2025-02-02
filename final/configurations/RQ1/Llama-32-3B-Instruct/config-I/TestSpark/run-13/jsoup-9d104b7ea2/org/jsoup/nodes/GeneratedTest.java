package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.DocumentFragmentFactory.create;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LeafNode parentNode;

    public TextNode createTextNode() {
        return new TextNode("");
    }

    @Before
    public void setup() {
        Mockito.when(parentNode.addNode(Mockito.anyInt(), Mockito.any(TextNode.class))).thenReturn(this);
    }

    @Test
    public void nodeName_isText() {
        String nodeName = createTextNode().nodeName();
        assertEquals("#text", nodeName);
    }

    @Test
    public void text_getsNormalisedWhitespace() {
        TextNode textNode = createTextNode("   ");
        String text = textNode.text();
        assertEquals(StringUtil.normaliseWhitespace("   "), text);
    }

    @Test
    public void text_setsCorrectText() {
        String originalText = "text";
        TextNode textNode = new TextNode(originalText);

        textNode.text(originalText).text(textNode.text());

        assertNotNull(textNode.text());
        assertEquals(originalText, textNode.text().toString());
    }

    @Test
    public void text_returnsBlankWhenBlank() {
        TextNode textNode = createTextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_returnsFalseWhenNotBlank() {
        String originalText = "text";
        TextNode textNode = new TextNode(originalText);

        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_splitsCorrectly() {
        String originalText = "ab";
        int offset = 1;
        TextNode textNode = createTextNode(originalText);
        TextNode tailNode = textNode.splitText(offset);

        assertNotNull(tailNode.text());
        assertEquals(originalText.substring(0, offset), textNode.text().toString());
    }

    @Test
    public void splitText_splitsOffsetBeyondEnd() {
        String originalText = "ab";
        int offset = 2;
        TextNode textNode = createTextNode(originalText);
        TextNode tailNode = textNode.splitText(offset);

        assertNull(tailNode.text());
    }

    @Test
    public void outerHtmlHead_indentsCorrectlyWhenPrettyPrinted() {
        String originalText = "   ";
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint = true;

        TextNode textNode = createTextNode(originalText);

        DocumentFragment fragment = new DocumentFragment();
        textNode.outerHtmlHead(accum, 0, out);
        fragment.append(accum);

        assertEquals("<div>\n", fragment.toString());
    }

    @Test
    public void outerHtmlTail_isEmptyWhenNotApplicable() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode textNode = createTextNode("");
        textNode.outerHtmlTail(accum, 0, out);

        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtml_returnsCorrectHtmlWhenPrettyPrinted() {
        String originalText = "text";
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint = true;

        TextNode textNode = createTextNode(originalText);

        String html = textNode.outerHtml();
        assertEquals("<p>text</p>", html);
    }

    @Test
    public void outerHtml_returnsCorrectHtmlWhenNotPrettyPrinted() {
        String originalText = "text";
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode textNode = createTextNode(originalText);

        String html = textNode.outerHtml();
        assertEquals("<span>text</span>", html);
    }

}