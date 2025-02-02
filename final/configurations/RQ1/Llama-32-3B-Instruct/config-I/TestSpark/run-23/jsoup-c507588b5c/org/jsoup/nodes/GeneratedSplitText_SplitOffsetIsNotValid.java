package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_SplitOffsetIsNotValid {

    @Test
    public void splitText_SplitOffsetIsNotValid() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = -1;
        assertFalse("Split offset must be not be negative", textNode.splitText(offset) != null);
    }

}