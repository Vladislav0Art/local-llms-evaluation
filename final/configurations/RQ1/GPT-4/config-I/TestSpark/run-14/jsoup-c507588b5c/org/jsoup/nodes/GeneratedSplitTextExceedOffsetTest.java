package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextExceedOffsetTest {

    @Test
    public void splitTextExceedOffsetTest() {
        TextNode textNode = new TextNode("Test Node");
        textNode.splitText(10);
    }

}