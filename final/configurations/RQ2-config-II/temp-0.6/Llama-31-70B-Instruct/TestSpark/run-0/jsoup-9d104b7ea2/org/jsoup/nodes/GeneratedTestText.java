package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestText {

    @Mock
    private TextNode textNode;

    @Test
    public void testText() {
        when(textNode.coreValue()).thenReturn("Text");

        String actual = textNode.text();

        assertEquals("Text", actual);
    }

}