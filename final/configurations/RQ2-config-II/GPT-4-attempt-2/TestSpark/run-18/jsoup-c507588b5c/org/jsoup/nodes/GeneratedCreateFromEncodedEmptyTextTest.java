package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedEmptyTextTest {

    @Test
    public void createFromEncodedEmptyTextTest() {
        String encodedText = "";
        TextNode node = TextNode.createFromEncoded(encodedText, false);
        Assert.assertTrue("Node should be empty", node.isBlank());
    }

}