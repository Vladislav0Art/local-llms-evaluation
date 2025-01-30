package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "<div>Hello, World!</div>";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        Assert.assertEquals("<div>Hello, World!</div>", textNode.getWholeText());
    }

}