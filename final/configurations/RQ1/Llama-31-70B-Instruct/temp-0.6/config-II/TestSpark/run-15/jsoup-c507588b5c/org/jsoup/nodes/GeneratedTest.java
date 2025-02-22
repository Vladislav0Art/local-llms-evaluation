package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private TextNode textNode;

    @Mock
    private Element element;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        textNode = new TextNode("text");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNodeSplit = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", textNodeSplit.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        when(element.shouldIndent(null)).thenReturn(true);
        when(element.isBlock()).thenReturn(true);
        when(element.formatAsBlock()).thenReturn(true);
        textNode.parentNode(element);
        textNode.siblingIndex = 0;
        textNode.outerHtmlHead(null, 1, null);
    }

    @Test
    public void testOuterHtmlTail() {
        textNode.outerHtmlTail(null, 1, null);
    }

}