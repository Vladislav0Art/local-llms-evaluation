package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextOffsetExceedsLengthTest {

    @Test
    public void splitTextOffsetExceedsLengthTest() {
        TextNode textNode = new TextNode("Test Text");
        textNode.splitText(500);
    }

}