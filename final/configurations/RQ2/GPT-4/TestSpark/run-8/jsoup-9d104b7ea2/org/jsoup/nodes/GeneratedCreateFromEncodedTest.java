package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "Test&#32;text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        Assert.assertEquals("Test text", textNode.getWholeText());
    }

}