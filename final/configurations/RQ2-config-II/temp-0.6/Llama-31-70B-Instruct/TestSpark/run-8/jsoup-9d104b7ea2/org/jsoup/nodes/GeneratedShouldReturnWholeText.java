package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldReturnWholeText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldReturnWholeText() {
        // when
        String wholeText = textNode.getWholeText();

        // then
        assertEquals("some text", wholeText);
    }

}