package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedIsBlank_ReturnsTrueWhenTextNodeTextIsBlank {

    @Test
    public void isBlank_ReturnsTrueWhenTextNodeTextIsBlank() {
        TextNode textNode = new TextNode("");
        boolean result = textNode.isBlank();
        assertTrue(result);
    }

}