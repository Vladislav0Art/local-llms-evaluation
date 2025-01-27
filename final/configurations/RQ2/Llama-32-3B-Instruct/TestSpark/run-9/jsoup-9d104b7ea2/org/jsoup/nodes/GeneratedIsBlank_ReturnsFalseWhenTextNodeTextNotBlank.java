package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedIsBlank_ReturnsFalseWhenTextNodeTextNotBlank {

    @Test
    public void isBlank_ReturnsFalseWhenTextNodeTextNotBlank() {
        TextNode textNode = new TextNode("text");
        boolean result = textNode.isBlank();
        assertFalse(result);
    }

}