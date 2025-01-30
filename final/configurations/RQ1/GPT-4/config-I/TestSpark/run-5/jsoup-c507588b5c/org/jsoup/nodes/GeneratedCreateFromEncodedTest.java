package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("<", node.getWholeText());
    }

}