package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&amp;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("&", textNode.getWholeText());
    }

}