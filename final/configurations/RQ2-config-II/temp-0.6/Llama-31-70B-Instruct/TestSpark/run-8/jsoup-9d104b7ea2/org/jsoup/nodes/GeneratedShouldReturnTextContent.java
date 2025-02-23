package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldReturnTextContent {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldReturnTextContent() {
        // when
        String text = textNode.text();

        // then
        assertEquals("some text", text);
    }

}