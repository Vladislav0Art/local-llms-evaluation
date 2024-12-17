package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_atOffsetTest_emptyString_afterSplit {

    @Test
    public void splitText_atOffsetTest_emptyString_afterSplit() {
        int offset = 1;
        TextNode textNode = new TextNode("");
        TextNode expectedTextNodeBeforeSplit = new TextNode("");
        TextNode resultTextNodeBeforeSplitCopy = expectedTextNodeBeforeSplit; // Create a copy of resultTextNodeBeforeSplit
        TextNode resultTextNodeAfterSplit = resultTextNodeBeforeSplitCopy.splitText(offset);
        assertEquals(expectedTextNode, resultTextNodeAfterSplit); // Compare with the original expectedTextNode
    }

}