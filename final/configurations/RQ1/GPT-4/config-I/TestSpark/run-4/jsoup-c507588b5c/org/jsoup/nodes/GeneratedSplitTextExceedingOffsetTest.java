package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextExceedingOffsetTest {

    @Test
    public void splitTextExceedingOffsetTest() {
        TextNode node = new TextNode("test");
        node.splitText(5);
    }

}