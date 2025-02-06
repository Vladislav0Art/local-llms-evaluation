package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedText_ReturnsText {

    @Test
    public void text_ReturnsText() {
        String text = "TextNode";
        when("text").thenReturn(text);
        assertEquals(text, ((TextNode) mock(TextNode)).text());
    }

}