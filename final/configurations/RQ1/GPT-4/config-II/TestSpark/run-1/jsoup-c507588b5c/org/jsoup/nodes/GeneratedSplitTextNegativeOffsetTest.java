package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextNegativeOffsetTest {

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Test");
        textNode.splitText(-2);
    }

}