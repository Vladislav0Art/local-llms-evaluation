package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextInvalidOffsetTest {

    @Test
    public void splitTextInvalidOffsetTest() {
        TextNode textNode = new TextNode("Test Case");
        textNode.splitText(15);
    }

}