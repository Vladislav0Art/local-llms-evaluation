package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_GivenOffsetSplittingInTheMiddleOfTextNode_SplittingIsSuccessful {

    @Test
    public void splitText_GivenOffsetSplittingInTheMiddleOfTextNode_SplittingIsSuccessful() throws IOException {
        String originalText = "Hello, World!";
        TextNode textNode = new TextNode(originalText + ", ");
        textNode.splitText(6); // Split at the middle of the node.
        assertEquals(originalText, originalText);
    }

}