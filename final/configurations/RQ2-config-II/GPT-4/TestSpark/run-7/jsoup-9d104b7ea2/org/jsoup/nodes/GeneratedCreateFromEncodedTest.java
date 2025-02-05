package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&#x20AC;";
        TextNode textNode = TextNode.createFromEncoded(encodedText, false);
        Assert.assertEquals("\u20AC", textNode.text());
    }

}