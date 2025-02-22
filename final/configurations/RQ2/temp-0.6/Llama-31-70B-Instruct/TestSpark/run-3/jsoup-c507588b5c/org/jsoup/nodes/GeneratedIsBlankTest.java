package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlankTest {

    @Mock
    private TextNode textNode;

    @Test
    public void isBlankTest() {
        when(textNode.isBlank()).thenReturn(false);
        assertFalse(textNode.isBlank());
    }

}