package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedClone_ReturnsSameInstance {

    @Test
    public void clone_ReturnsSameInstance() {
        TextNode textNode = mock(TextNode.class);
        when("clone").thenReturn(textNode);
        assertTrue(((TextNode) textNode).clone() == textNode);
    }

}