package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode createdNode = TextNode.createFromEncoded("&lt;");
        Assert.assertEquals("<", createdNode.getWholeText());
    }

}