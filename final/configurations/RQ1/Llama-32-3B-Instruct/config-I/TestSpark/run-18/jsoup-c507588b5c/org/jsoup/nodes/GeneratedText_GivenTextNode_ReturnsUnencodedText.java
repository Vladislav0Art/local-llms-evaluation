package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedText_GivenTextNode_ReturnsUnencodedText {

    @Mock
    private Node parentNode;

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}