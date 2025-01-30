package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetNegativeTest {

    @Test
    public void splitTextOffsetNegativeTest() {
        TextNode textNode = new TextNode("Split Text");
        textNode.splitText(-1);
    }

}