package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test&lt;case&gt;");
        Assert.assertEquals("Test<case>", textNode.getWholeText());
    }

}