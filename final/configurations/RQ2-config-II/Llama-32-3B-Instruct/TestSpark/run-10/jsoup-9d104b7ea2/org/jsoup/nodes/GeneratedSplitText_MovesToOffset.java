package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedSplitText_MovesToOffset {

    @Test
    public void splitText_MovesToOffset() {
        TextNode textNode = mock(TextNode.class);
        when("text").thenReturn("text");
        when("splitText(1)").thenReturn(newTextNode(""));
        ((TextNode) textNode).splitText(1);
        assertEquals((String) mock(String.class), ((TextNode) textNode).text());
    }

}