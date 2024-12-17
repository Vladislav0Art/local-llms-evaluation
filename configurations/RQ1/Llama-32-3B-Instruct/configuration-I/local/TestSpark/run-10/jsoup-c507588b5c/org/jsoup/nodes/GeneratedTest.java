package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.junit.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    // TextNode constructor tests

    @Test
    public void createTextNode_fromEmptyString_testIsBlankReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void createTextNode_fromSingleSpaceChar_isBlankReturnsFalse() {
        TextNode textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void createTextNode_fromMultipleWordsIsBlankReturnsFalse() {
        TextNode textNode = new TextNode("word1 word2");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void text_method_retrunsUnescapedText() {
        when(parentNode.getWholeText()).thenReturn("original text");
        TextNode textNode = new TextNode("");
        textNode.coreValue = "original text";
        assertEquals("original text", textNode.text());
    }

    @Test
    public void text_method_returnsTrimmedWhitespace() {
        when(parentNode.getWholeText()).thenReturn("   original text  ");
        TextNode textNode = new TextNode("");
        textNode.coreValue = "   original text  ";
        assertEquals("original text", textNode.text());
    }

    @Test
    public void isBlank_method_returnsTrue_ifNoTextContent() {
        when(parentNode.getWholeText()).thenReturn("");
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_method_returnsFalse_ifTextContentPresent() {
        when(parentNode.getWholeText()).thenReturn("present text");
        TextNode textNode = new TextNode("");
        textNode.coreValue = "present text";
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_method_splitsTextAtOffsetCorrectly() {
        when(parentNode.getWholeText()).thenReturn("original text");
        TextNode textNode = new TextNode("");
        textNode.coreValue = "original text";
        int offset = 5;
        TextNode expectedTextNode = new TextNode("orignal t");
        textNode.splitText(offset);
        assertEquals(expectedTextNode, textNode.nextSibling());
    }

    @Test
    public void splitText_method_returnsEmptyTextNode_ifOffsetOutOfRange() {
        when(parentNode.getWholeText()).thenReturn("original text");
        TextNode textNode = new TextNode("");
        textNode.coreValue = "original text";
        int offset = 10;
        assertEquals("", textNode.splitText(offset).text());
    }

    @Test
    public void outerHtmlHead_method_appendsToAccum() {
        when(accum.append(anyString())).thenAnswer((o) -> o);
        TextNode textNode = new TextNode("");
        accum = mock(Appendable.class);
        textNode.outerHtmlHead(accum, 0, out);
        verify(accum).append("TextNode");
    }

    @Test
    public void outerHtmlHead_method_skipsEmptyTextNode() {
        when(parentNode.getWholeText()).thenReturn("");
        TextNode textNode = new TextNode("");
        accum = mock(Appendable.class);
        textNode.outerHtmlHead(accum, 0, out);
        verify(accum).append("TextNode");
    }

}