package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Sample&amp;text", false);
        Assert.assertEquals("Sample&text", textNode.text());
    }

}