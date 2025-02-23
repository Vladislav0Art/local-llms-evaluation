package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldReturnNodeName() {
        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("#text", nodeName);
    }

    @Test
    public void shouldReturnTextContent() {
        // when
        String text = textNode.text();

        // then
        assertEquals("some text", text);
    }

    @Test
    public void shouldSetTextContent() {
        // given
        String newText = "new text";

        // when
        textNode.text(newText);

        // then
        assertEquals(newText, textNode.text());
    }

    @Test
    public void shouldReturnWholeText() {
        // when
        String wholeText = textNode.getWholeText();

        // then
        assertEquals("some text", wholeText);
    }

    @Test
    public void shouldCheckIfTextNodeIsBlank() {
        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertEquals(false, isBlank);
    }

}