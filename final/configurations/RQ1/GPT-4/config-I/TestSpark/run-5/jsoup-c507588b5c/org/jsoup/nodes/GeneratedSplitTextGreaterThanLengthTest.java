package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextGreaterThanLengthTest {

    @Test
    public void splitTextGreaterThanLengthTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        node.splitText(text.length() + 1);
    }

}