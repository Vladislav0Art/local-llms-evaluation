package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextOutOfBoundsNegativeTest {

    @Test
    public void splitTextOutOfBoundsNegativeTest() {
        TextNode node = new TextNode("This is some text");
        node.splitText(-1); // this should throw an exception
    }

}