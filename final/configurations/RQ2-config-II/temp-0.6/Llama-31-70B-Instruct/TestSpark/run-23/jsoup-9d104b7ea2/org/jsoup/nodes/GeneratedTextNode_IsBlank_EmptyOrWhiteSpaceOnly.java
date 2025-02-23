package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTextNode_IsBlank_EmptyOrWhiteSpaceOnly {

    @Test
    public void textNode_IsBlank_EmptyOrWhiteSpaceOnly() {
        TextNode textNode = new TextNode("   ");
        boolean expected = true;
        boolean actual = textNode.isBlank();
        assertEquals(expected, actual);
    }

}