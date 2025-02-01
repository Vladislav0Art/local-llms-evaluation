package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextNegativeOffsetTest {

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Hello, World!");
        textNode.splitText(-1);
    }

}