package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest_NegativeOffset {

    @Test
    public void splitTextTest_NegativeOffset() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

}