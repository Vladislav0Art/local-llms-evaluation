package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextInvalidOffsetTest {

    @Test
    public void splitTextInvalidOffsetTest() {
        String text = "Test Text";
        TextNode node = new TextNode(text);
        node.splitText(-1);
    }

}