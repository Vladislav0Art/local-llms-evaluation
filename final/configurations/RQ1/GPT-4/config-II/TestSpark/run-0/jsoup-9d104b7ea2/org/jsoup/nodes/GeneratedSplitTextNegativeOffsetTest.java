package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextNegativeOffsetTest {

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Test case");
        textNode.splitText(-1);
    }

}