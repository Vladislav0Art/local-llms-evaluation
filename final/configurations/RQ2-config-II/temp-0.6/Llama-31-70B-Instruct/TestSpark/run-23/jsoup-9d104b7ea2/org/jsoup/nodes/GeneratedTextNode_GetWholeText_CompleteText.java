package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTextNode_GetWholeText_CompleteText {

    @Test
    public void textNode_GetWholeText_CompleteText() {
        TextNode textNode = new TextNode("Hello World");
        String expected = "Hello World";
        String actual = textNode.getWholeText();
        assertEquals(expected, actual);
    }

}