package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextLargeOffsetTest {

    @Test
    public void splitTextLargeOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}