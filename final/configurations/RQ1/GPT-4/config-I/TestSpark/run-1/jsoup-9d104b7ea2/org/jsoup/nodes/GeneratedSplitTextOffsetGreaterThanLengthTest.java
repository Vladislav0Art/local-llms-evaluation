package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextOffsetGreaterThanLengthTest {

    @Test
    public void splitTextOffsetGreaterThanLengthTest() {
        TextNode textNode = new TextNode("Test");
        textNode.splitText(10);
    }

}