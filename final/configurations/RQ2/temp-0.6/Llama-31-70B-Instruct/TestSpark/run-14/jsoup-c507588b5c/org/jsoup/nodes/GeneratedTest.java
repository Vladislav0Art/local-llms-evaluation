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
        textNode = new TextNode("example text");
    }

    @Test
    public void shouldGetNodeName() {
        String nodeName = textNode.nodeName();
        assertEquals("#text", nodeName);
    }

    @Test
    public void shouldGetTextContent() {
        String textContent = textNode.text();
        assertEquals("example text", textContent);
    }

    @Test
    public void shouldSetTextContent() {
        String newText = "new text";
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

    @Test
    public void shouldGetWholeText() {
        String wholeText = textNode.getWholeText();
        assertEquals("example text", wholeText);
    }

    @Test
    public void shouldCheckIfNodeIsBlank() {
        boolean isBlank = textNode.isBlank();
        assertEquals(false, isBlank);
    }

    @Test
    public void shouldSplitTextNode() {
        TextNode splitNode = textNode.splitText(2);
        assertEquals("ex", textNode.getWholeText());
        assertEquals("ample text", splitNode.getWholeText());
    }

}