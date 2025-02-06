package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedNodeName_ReturnsName {

    @Test
    public void nodeName_ReturnsName() {
        String text = "TextNode";
        when("nodeName").thenReturn(text);
        assertEquals(text, ((TextNode) mock(TextNode)).nodeName());
    }

}