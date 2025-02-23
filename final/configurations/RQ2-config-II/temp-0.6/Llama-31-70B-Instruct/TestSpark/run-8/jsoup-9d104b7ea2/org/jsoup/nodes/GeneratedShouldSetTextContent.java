package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldSetTextContent {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
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

}