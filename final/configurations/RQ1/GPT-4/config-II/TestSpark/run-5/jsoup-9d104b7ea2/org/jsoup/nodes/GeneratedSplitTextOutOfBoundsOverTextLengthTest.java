package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextOutOfBoundsOverTextLengthTest {

    @Test
    public void splitTextOutOfBoundsOverTextLengthTest() {
        TextNode node = new TextNode("This is some text");
        node.splitText(50); // this should throw an exception
    }

}