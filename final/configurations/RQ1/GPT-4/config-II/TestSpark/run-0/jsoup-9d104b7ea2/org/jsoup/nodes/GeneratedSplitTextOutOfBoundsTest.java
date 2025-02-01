package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextOutOfBoundsTest {

    @Test
    public void splitTextOutOfBoundsTest() {
        TextNode textNode = new TextNode("Test case");
        textNode.splitText(50);
    }

}