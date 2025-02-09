package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("Test%20Text", true);
        Assert.assertEquals("Test Text", tn.text());
    }

}