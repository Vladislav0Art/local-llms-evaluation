package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest_TooLargeOffset {

    @Test
    public void splitTextTest_TooLargeOffset() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}