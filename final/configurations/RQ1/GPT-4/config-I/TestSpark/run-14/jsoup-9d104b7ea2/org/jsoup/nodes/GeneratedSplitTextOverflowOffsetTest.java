package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOverflowOffsetTest {

    @Test
    public void splitTextOverflowOffsetTest() {
        TextNode node = new TextNode("Test");
        node.splitText(5);
    }

}