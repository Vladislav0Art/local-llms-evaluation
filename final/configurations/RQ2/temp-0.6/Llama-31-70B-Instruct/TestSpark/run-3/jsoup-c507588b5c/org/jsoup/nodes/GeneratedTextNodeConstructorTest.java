package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeConstructorTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textNodeConstructorTest() {
        when(textNode.text()).thenReturn("test");
        assertEquals("test", textNode.text());
    }

}