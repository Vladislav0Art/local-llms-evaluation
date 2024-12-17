package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_atOffsetTest_nonEmptyString {

    @Test
    public void splitText_atOffsetTest_nonEmptyString() {
        int offset = 5;
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode expectedTextNodeBeforeSplit = new TextNode("Hello");
        TextNode resultTextNodeBeforeSplitCopy = expectedTextNodeBeforeSplit; // Create a copy of resultTextNodeBeforeSplit
        TextNode resultTextNodeAfterSplit = resultTextNodeBeforeSplitCopy.splitText(offset); // Split the copied resultTextNodeBeforeSplit instead of original one
        assertEquals(expectedTextNodeBeforeSplit, resultTextNodeAfterSplit);
    }

}