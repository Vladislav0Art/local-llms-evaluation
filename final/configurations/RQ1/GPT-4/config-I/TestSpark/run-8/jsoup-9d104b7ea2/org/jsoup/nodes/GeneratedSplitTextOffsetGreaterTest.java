package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetGreaterTest {

    @Test
    public void splitTextOffsetGreaterTest() {
        TextNode textNode = new TextNode("Split Text");
        textNode.splitText(20);
    }

}