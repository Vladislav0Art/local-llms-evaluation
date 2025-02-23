package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlank {

    @Mock
    private TextNode textNode;

    @Test
    public void testIsBlank() {
        when(textNode.coreValue()).thenReturn("");

        boolean actual = textNode.isBlank();

        assertTrue(actual);
    }

}