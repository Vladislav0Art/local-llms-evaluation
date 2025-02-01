package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextNegativeOffsetTest {

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode node = new TextNode("This is a test");
        node.splitText(-1);
    }

}