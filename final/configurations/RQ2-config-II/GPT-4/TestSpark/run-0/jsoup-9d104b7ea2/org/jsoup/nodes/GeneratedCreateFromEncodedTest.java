package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void CreateFromEncodedTest() {
        String encodedText = "test&amp;text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("test&text", textNode.text());
    }

}