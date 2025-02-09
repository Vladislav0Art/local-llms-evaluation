package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedNonEmptyTextTest {

    @Test
    public void createFromEncodedNonEmptyTextTest() {
        String encodedText = "&amp;&lt;&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText, false);
        Assert.assertEquals("Encoded text not preserved", encodedText, node.getWholeText());
    }

}