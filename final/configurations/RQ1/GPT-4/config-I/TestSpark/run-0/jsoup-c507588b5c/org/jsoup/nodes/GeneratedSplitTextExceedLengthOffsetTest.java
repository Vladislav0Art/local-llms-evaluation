package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextExceedLengthOffsetTest {

    @Test
    public void splitTextExceedLengthOffsetTest() {
        TextNode textNode = new TextNode("Test");
        textNode.splitText(5);
    }

}