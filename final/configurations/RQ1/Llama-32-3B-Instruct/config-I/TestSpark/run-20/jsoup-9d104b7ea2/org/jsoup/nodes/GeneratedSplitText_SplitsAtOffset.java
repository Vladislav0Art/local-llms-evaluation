package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedSplitText_SplitsAtOffset {

    @Test
    public void splitText_SplitsAtOffset() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode result = textNode.splitText(offset);
        assertEquals("World!", result.getWholeText());
        assertEquals("Hello ", textNode.getWholeText());
    }

}