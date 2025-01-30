package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String htmlEncoded = "&lt;p&gt;Hello World&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(htmlEncoded);
        Assert.assertEquals("<p>Hello World</p>", textNode.getWholeText());
    }

}