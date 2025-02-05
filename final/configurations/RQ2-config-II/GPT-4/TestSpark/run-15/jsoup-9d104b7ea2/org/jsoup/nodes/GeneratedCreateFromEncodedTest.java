package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;p&gt;Some text&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText, false);
        Assert.assertEquals("<p>Some text</p>", textNode.getWholeText());
    }

}