package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextExceedLengthOffsetTest {

    @Test
    public void splitTextExceedLengthOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}