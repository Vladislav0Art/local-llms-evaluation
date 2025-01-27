package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_SplittingAtOffset_MatchesCorrectedText {

    @Test
    public void splitText_SplittingAtOffset_MatchesCorrectedText() {
        String text = "Hello World";
        int offset = 5;
        TextNode node = new TextNode(text);
        TextNode actualSplitNode = node.splitText(offset);
        assertEquals("World", actualSplitNode.text());
    }

}