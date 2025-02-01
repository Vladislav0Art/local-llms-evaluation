package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetGreaterThanLengthTest {

    @Test
    public void splitTextOffsetGreaterThanLengthTest() {
        TextNode textNode = new TextNode("split me");
        textNode.splitText(100);
    }

}