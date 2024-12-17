package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_atOffsetTest_emptyString {

    @Test
    public void splitText_atOffsetTest_emptyString() {
        int offset = 0;
        TextNode textNode = new TextNode("");
        TextNode expectedTextNode = new TextNode("");
        TextNode resultTextNodeBeforeSplit = textNode.splitText(offset);
        assertEquals(expectedTextNode, resultTextNodeBeforeSplit);
    }

}