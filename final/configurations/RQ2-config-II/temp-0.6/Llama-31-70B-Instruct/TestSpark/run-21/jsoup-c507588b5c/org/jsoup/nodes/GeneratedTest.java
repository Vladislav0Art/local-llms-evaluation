package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test text");
    }

    @Test
    public void nodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        assertEquals("test text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        assertEquals("test text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode splitNode = textNode.splitText(4);
        assertEquals("test", textNode.coreValue());
        assertEquals(" text", splitNode.coreValue());
    }

    @Test
    public void outerHtmlHeadTest() {
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        when(outputSettings.prettyPrint()).thenReturn(false);
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, outputSettings);
        assertEquals("test text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        when(outputSettings.prettyPrint()).thenReturn(false);
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, outputSettings);
        assertEquals("", accum.toString());
    }

}