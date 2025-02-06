package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedText_SetsText {

    @Test
    public void text_SetsText() {
        String newText = "newText";
        TextNode textNode = mock(TextNode.class);
        when(textNode.text()).thenReturn(newText);
        ((TextNode) textNode).text(newText);
        assertEquals(newText, ((TextNode) textNode).text());
    }

}