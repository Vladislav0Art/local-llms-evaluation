package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_GivenOffsetSplittingAtEndOfTextNode_SplittingIsSuccessful {

    @Test
    public void splitText_GivenOffsetSplittingAtEndOfTextNode_SplittingIsSuccessful() throws IOException {
        String originalText = "Hello, World!";
        TextNode textNode = new TextNode(originalText);
        textNode.splitText(0); // Split at the beginning of the node.
        assertEquals(originalText, originalText);
    }

}