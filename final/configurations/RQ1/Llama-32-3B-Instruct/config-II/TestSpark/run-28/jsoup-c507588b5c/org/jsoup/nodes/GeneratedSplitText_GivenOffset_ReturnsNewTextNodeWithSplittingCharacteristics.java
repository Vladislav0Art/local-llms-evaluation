package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_GivenOffset_ReturnsNewTextNodeWithSplittingCharacteristics {

    @Test
    public void splitText_GivenOffset_ReturnsNewTextNodeWithSplittingCharacteristics() throws IOException {
        String text = "test";
        int offset = 3;
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(offset);
        assertNotNull(splitTextNode);
    }

}