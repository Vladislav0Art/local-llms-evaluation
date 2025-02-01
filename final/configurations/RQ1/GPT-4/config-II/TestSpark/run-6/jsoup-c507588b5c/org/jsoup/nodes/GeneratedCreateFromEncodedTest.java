package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;test&gt;");
        Assert.assertEquals("<test>", textNode.getWholeText());
    }

}