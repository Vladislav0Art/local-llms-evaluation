package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test Case", true);
        Assert.assertEquals("Test Case", textNode.getWholeText());
    }

}