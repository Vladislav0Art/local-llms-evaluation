package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String sampleText = "&lt;div&gt;Test&lt;/div&gt;";
        TextNode node = TextNode.createFromEncoded(sampleText);
        Assert.assertEquals("<div>Test</div>", node.text());
    }

}