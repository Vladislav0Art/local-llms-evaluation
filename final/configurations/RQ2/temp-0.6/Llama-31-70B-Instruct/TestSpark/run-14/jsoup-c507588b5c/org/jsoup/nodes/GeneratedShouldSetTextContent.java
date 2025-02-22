package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedShouldSetTextContent {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("example text");
    }

    @Test
    public void shouldSetTextContent() {
        String newText = "new text";
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}