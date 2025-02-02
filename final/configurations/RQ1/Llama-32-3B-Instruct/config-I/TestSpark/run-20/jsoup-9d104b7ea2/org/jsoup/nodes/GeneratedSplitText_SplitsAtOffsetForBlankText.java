package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedSplitText_SplitsAtOffsetForBlankText {

    @Test
    public void splitText_SplitsAtOffsetForBlankText() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        int offset = 1;
        TextNode result = textNode.splitText(offset);
        assertEquals("", result.getWholeText());
        assertEquals(" ", textNode.getWholeText());
    }

}