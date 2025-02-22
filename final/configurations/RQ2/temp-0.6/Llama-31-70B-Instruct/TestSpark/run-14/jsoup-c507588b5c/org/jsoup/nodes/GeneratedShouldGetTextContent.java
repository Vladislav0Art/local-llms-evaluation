package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedShouldGetTextContent {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("example text");
    }

    @Test
    public void shouldGetTextContent() {
        String textContent = textNode.text();
        assertEquals("example text", textContent);
    }

}